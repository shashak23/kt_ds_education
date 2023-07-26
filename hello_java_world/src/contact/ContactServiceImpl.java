package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService{

	private List<ContactVO> contactList;

	private int count; // 0725-코드
	// 원래는 count = 0; 이었는데 밑에 생성라는 만듦으로써 굳이 안해도 됨
	// 데이터만 넣어서 CRUD를 하는 공간
	
	public ContactServiceImpl(List<ContactVO> contactVOArray) {
		List<ContactVO> temp = new ArrayList<>();
		temp.addAll(contactVOArray);
		this.contactList = temp;
		// 배열을 읽는 생성자 만들기
	}
 

	public ContactServiceImpl() { // 파라미터가 없으면 새로운 리스트를 받음
		super();
		this.contactList = new ArrayList<>();
		
	}


	@Override
	public void create(ContactVO contact) {
		contactList.add(contact);
		// 여기서 배열에 넣어주는 것
	}

	// 전체 조회
	@Override
	public List<ContactVO> readAll() { 
		return new ArrayList<>(contactList) ;
		// 배열만 돌려줘도 충분함
	}

	// 개별 조회
	@Override
	public ContactVO readOne(int index) {
		if(contactList.size() < index) {
			// index가 범위를 넘어가면 널 리턴
			return null;
		}
		return contactList.get(index);
	}

	@Override
	public void updateOne(int index, ContactVO contactVO) {
		if(contactList.size() < index) {
			// index가 범위를 넘어가면 보이드 리턴
			return;
		}
		contactList.set(index, contactVO); 
		// 배열 해당 인덱스에다가 해당 객체 넣어주기 
		
	}

	@Override
	public void deleteOne(int index) {
//		if(contactList.size() < index) {
//			// index가 범위를 넘어가면 보이드 리턴
//			return;
//		}
		contactList.remove(index); // 해당 인덱스 자리만 지우기
		// contactList.// 다 지우는 거는 clear
		
	}
}
