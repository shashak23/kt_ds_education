package contact;

public interface ContactService {
	
	/**
	 * 등록 (Create)
	 * @param contact : 등록하려는 연락처의 정보
	 * @see contact.ContactVO : contact 패키지에 있는 ContactVO를 참고해라
	 */
	// 등록 -- contactVO를
	public void create(ContactVO contact);
	
	/**
	 * 목록 조회(Read)
	 * @return 구현 크래스가 관리하는 연락처 배열
	 * @see contact.ContactVO
	 */
	// 조회 -- 적어도 1개 이상이 보여야겠죠? 그럼 contactvo를 배열로 받기 
	public ContactVO[] readAll();
	
	/**
	 * 개별 조회(Read)
	 * @param index : 구현 클래스가 관리하는 연락처 배열의 인덱스
	 * @return 연락처 배열에서 index에 해당하는 ContactVO가 반환됨
	 * 			index값이 존재 하지 않는 경우 ArrayIndexOutOfBoundsException이 발생한다.
	 * @see contact.ContactVO
	 */
	// 조회 -- 1개만 조회, 배열의 1 인덱스를 조회할거에요
	public ContactVO readOne(int index);	
	
	/**
	 * 수정(Update)
	 * @param index : 구현 클래스가 관리하는 연락처 배열의 인덱스
	 * @param contactVO : 연락처 배열의 index요소에 덮어쓸 갱신될 연락처 정보
	 * @see contact.ContactVO
	 */
	// 수정 -- 몇번 인덱스의 값을 고치는 거겠죠? 근데 기억이 안나면 일단 void
	// contactvo에 정보니까 같이 가져오기!
	// 배열의 index를 contactVO로 바꿔줘 라는 뜻
	public void updateOne(int index, ContactVO contactVO);
	
	/**
	 * 삭제 (Delete)
	 * @param index : 구현 클래스가 관리하는 연락처 배열의 삭제하고자 하는 인덱스
	 * 					삭제된 index의 값은 null로 변경된다.
	 */
	// 삭제 -- 위의 배열에서 해당하는 인덱스만 지워라
	public void deleteOne(int index);

}
