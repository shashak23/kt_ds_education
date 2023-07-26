package contact;

public class ContactApp {

	// 4단계
	// 컨택트 서비스에서 데이터를 위임받은 핸들러가
	// 여기의 main에서 동작을 할 것이고
	// 각자 받은 impl를 기반으로 한다.
	// 그래서 건너 건너 동작시키도록 impl를 가져옴
	
	public static void main(String[] args) {
		// VO를 12번만 관리하라는 조건을 제시해서 -> impl 에게 전달 -> service에 넣음
		//ContactService service = new ContactServiceImpl(new ContactVO[12]);
		//ContactHandler handler = new ContactHandlerImpl();
		
		// 결국 위의 두 줄과 아래 한 줄은 같은 목적으로 만들어 진 것이고
		// 아래처럼 한 줄로 줄일 수 있다.
		ContactHandler handler = new ContactHandlerImpl(new ContactServiceImpl());
		
		// 등록
		handler.create("kimsiha", 010, "siha");
		handler.create("kimsshh", 011, "sih");
		handler.create("kimhhha", 012, "sia");
		handler.create("kimsssa", 013, "sha");
		// 전체 조회
		handler.readAll();  // open implementation을 누르면 원래 하는 일이 나옴
		
		// 개별 조회
		handler.readOne(1);
		
		// 개별 삭제
		handler.delete(0);
		
		// 전체 조회
		handler.readAll();
		
		// 개별 수정
		handler.updateOne(1, "kimsiha", 010, "siha");
		
		// 전체 조회 
		handler.readAll();
	}
}
