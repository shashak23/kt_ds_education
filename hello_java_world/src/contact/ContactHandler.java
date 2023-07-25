package contact;

public interface ContactHandler {
	// 핸들러는 애초에 다른 데이터를 가져와서 활동하도록 하는 역할이라서
	// 핸들러를 최대한 활용을 해야한다.
	
	/**
	 * 연락처를 등록한다. 4단계
	 * @param name 연락처에 등록될 이름
	 * @param phone 연락처에 등록될 번호
	 * @param email 연락처에 등록될 이메일
	 */
	// 등록하기 -- 3단계
	public void create(String name, int phone, String email);
	
	/**
	 * 등록된 모든 연락처 정보를 조회하고 출력한다
	 */
	// 전체 조회 -- 3단계
	public void readAll();
	
	/**
	 * 등록된 연락처 중 하나의 정보만 조회해서 출력한다
	 * @param idx 조회할 연락처의 인덱스 번호
	 */
	// 개별 조회 -- 3단계 
	public void readOne(int index);
	
	/**
	 * 등록된 연락터 중 하나의 정보만 삭제한다.
	 * @param idx 삭제할 연락처의 인덱스 번호
	 */
	// 삭제하기 -- 3단계
	public void delete(int index);
	
	/**
	 * 등록된 연락처 중 하나의 정보만 수정한다.
	 * @param idx 수정할 연락처의 인덱스 번호
	 * @param name 수정할 연락처의 이름
	 * @param phone 수정할 연락처의 번호
	 * @param email 수정할 연락처의 이메일주소
	 */
	// 수정하기 -- 3단계
	public void updateOne(int index, String name, int phone, String email);
}
