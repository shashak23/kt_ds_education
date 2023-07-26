package generic;

public class ScoreList<T> {
	
	private Object[] scoreArray;
	private int size;
	
	public ScoreList() {
		this.scoreArray = new Object[2];
		// 7. 그냥 T 를 쓰는 건 안돼요.
		// 원래는 타입을 주고 생성하니까 가능한데
		// 그게 안되니까 여기서는 Object를 써요 
		// Object가 제일 공통적인 객체니까!
	}
	
	public void add(int score) {
		// 2. 인덱스 사이즈가 배열의 길이보다 크면
		if(this.size >= this.scoreArray.length) {
			// 넉넉하게 2씩 공간이 넓어지는 것 임시로 만들고 
			// 8. int -> Object로 변경하기 
			Object[] tempScoreArray = new Object[this.scoreArray.length + 2];
			// 복사하고
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			// 복사완료
			this.scoreArray = tempScoreArray;
		}
		
		this.scoreArray[this.size++] = score;
		// 1. score를 전달받으면 전달받은 score를 할당해주고 
		// 인덱스의 size가 하나씩 커진다
		
	}
	
	public T get(int index) {
		// 3. 위에서 socrearray에서 인덱스를 줄건데 
		// 사이즈와 인덱스를 검사해서 줄텐데 
		// 만약에 인덱스가 사이즈보다 크거나 같으면 예외처리에 던지고
		if(index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		// 4. 배열의 인덱스로 돌리는 거 하고 
		// 6. T로 바꾸면 형변환을 꼭 해줘야한다. (T) 넣기 
		return (T) this.scoreArray[index]; 
		// 9. 여기서 워닝이 나오는 이유는 형변환떄문에 근데 사실 큰 문제는 없다.
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		// 5. 
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList [ ");
		
		for(int i=0; i < this.size; i++) {
			sb.append(this.scoreArray[i] + ",");
		}
		sb.append("]");

		return super.toString();
	}
	
	
//	public static void main(String[] args) {
//		// 배열 하나 만들기 
//		int[] array1 = new int[1]; // 1개만 넣을 수 있는 배열을 만들기
//		array1[0] = 10;
//		// array1[1] = 20; // ArrayIndexOutOfBoundException 예외 발생
//		// 위와 같이 추가로 하고 싶을 때 하는 것이 배열 복사임
//		
//		// 복사 받을 배열 만들기 
//		int[] array2 = new int[array1.length + 1];
//		
//		// 배열 복사하기 
//		// array1 -> array2으로 복사 
//		System.arraycopy(array1, 0, array2, 0, array1.length);
//		// System.out.println(array1[0]);
//		// System.out.println(array2[0]); // 둘은 같아 짐
//		
//		array2[1] = 20; // 20이 할당됨
//		
//		// for each 로 확인해 보기
//		// int 타입의 할당받을 number 적기 
//		for(int number : array2) {
//			// 그러면 배열의 값에 하나씩 넘버를 변수의 배열 요소가 할당되요!
//			// 인덱스 값이 필요하지 않을 때 위와 같이 쓴다.
//			// 전통적인 for 방법보다 속도가 빠르다
//			
//		}
//		int[] array3 = new int[array2.length + 1];
//		System.arraycopy(array2, 0, array3, 0, array2.length);
//		array3[2] = 30;
//		for(int number : array3) {
//			System.out.println(number);
//		}
//	}

}
