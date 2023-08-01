package member;

// 필요한 클래스에 따라 몇 개를 추가해도 상관이 없다.
public class VipMemberServiceImpl implements MemberService, VipMemberService{

	public void receiveVip() {
		System.out.println("Receive Vip Package");
		
	}

	@Override
	public void join() {
		System.out.println("Join Vip Package");
		
	}

	@Override
	public void login() {
		System.out.println("Login Vip Package");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("Delete Vip Package");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout Vip Package");
		
	}

}
