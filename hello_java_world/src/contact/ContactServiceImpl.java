package contact;

public class ContactServiceImpl implements ContactService{

	private ContactVO[] contactVOArray;

	private int count; // 0725-코드
	// 원래는 count = 0; 이었는데 밑에 생성라는 만듦으로써 굳이 안해도 됨
	// 데이터만 넣어서 CRUD를 하는 공간
	
	public ContactServiceImpl(ContactVO[] contactVOArray) {
		this.contactVOArray = contactVOArray;
		// 배열을 읽는 생성자 만들기
	}
 
	@Override
	public void create(ContactVO contact) {
		contactVOArray[count++] = contact;
		// 여기서 배열에 넣어주는 것
	}

	// 전체 조회
	@Override
	public ContactVO[] readAll() { 
		return contactVOArray ;
		// 배열만 돌려줘도 충분함
	}

	// 개별 조회
	@Override
	public ContactVO readOne(int index) {
		return contactVOArray[index];
	}

	@Override
	public void updateOne(int index, ContactVO contactVO) {
		contactVOArray[index] = contactVO; 
		// 배열 해당 인덱스에다가 해당 객체 넣어주기 
		
	}

	@Override
	public void deleteOne(int index) {
		contactVOArray[index] = null;
		
	}
}
