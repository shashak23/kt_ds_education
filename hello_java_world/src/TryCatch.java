
public class TryCatch {
	
	// 실무에서 많이 쓰이는 코드에요
		public void loadClass3() {
			try {
				Class.forName("ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				// 예외가 발생한 사실을 이것밖에 몰라요
			}
		}
	
	// 실무에서 많이 쓰이는 코드에요
	public void loadClass2() {
		try {
			Class.forName("ddddddddd");
		} catch (ClassNotFoundException e) {
			// catch에서 마땅히 할게 없다라고 느낀다면 아래와 같이 바꿀 수 있다.
			// e.printStackTrace();
			// 예외를 발생했을 때 감싸서 던져버리는 것
			// try catch가 필요없는 runtime으로 던지고 -- 선택권을 줌
			// 하고 싶은 처리를 할 수 있도록 해줌 -- 선택에 따라 진행
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	public void parseInt() {
		Integer.parseInt("asdf");
	}
	
	public void loadClass() throws ClassNotFoundException {
		Class.forName("sdfsdfsdf"); // 나를 호출하는 ClassNotFoundException 한테 throws 한거임
	}

	public static void main(String[] args) {
		
		TryCatch tc = new TryCatch();
		// 예외 try catch로 하기 
		try {
			tc.loadClass2();
		} catch (RuntimeException e) {
			// 필요한 처리를 작성한다
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
				
		// 예외 무시하기
		tc.loadClass3();

		
		try {
			tc.loadClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String type = "number";
//		String number = "abc";
//		
//		try {
//			if(type.equals("number")) {
//				int num = Integer.parseInt(number);
//				System.out.println(num);
//			}
//		} catch (NullPointerException | NumberFormatException ex) {
//			//e.printStackTrace();
//			ex.printStackTrace();
//		} 
//		catch (NumberFormatException ne) {
//			ne.printStackTrace();
//		}
		
		
		
//		try {
//			Integer.parseInt("1234");
//			System.out.println("1");
//			System.out.println("2");
//			System.out.println("3");
//		}
//		catch(NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("Message" + e.getMessage());
//		
//		}
//		finally {
//			
//			System.out.println("Complete");
//		}
	}
}
