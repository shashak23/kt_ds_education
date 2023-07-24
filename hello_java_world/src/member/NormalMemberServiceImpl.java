package member;

// implements를 쓰는 class에는 별도로 Impl 를 붙여서 티를 낸다.
public class NormalMemberServiceImpl implements MemberService{

	// 모든 메소드 가져오기
	@Override
	public void join() {
		System.out.println("Register Member");
		
	}

	@Override
	public void login() {
		System.out.println("Login Member");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("Delete Member");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout Member");
		
	}

	
}
