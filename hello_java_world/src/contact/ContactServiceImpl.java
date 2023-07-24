package contact;

public class ContactServiceImpl implements ContactService{

	private ContactVO[] contactVOArray;
	
	// 데이터만 넣어서 CRUD를 하는 공간

	@Override
	public void create(ContactVO contact) {
		
	}

	@Override
	public ContactVO[] readAll() {
		// TODO Auto-generated method stub
		return contactVOArray ;
	}

	@Override
	public ContactVO readOne(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOne(int index, ContactVO contactVO) {
		
		
	}

	@Override
	public void deleteOne(int index) {
		
		
	}
}
