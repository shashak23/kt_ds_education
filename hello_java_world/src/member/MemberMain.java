package member;

public class MemberMain {

	public static void main(String[] args) {
		// 인터페이스 =  클래스명
		MemberService normalMemberService = new NormalMemberServiceImpl();
		normalMemberService.join();
		normalMemberService.login();
		normalMemberService.deleteMe();
		normalMemberService.logout();
		
		
		MemberService vipMemberService = new VipMemberServiceImpl();
		vipMemberService.join();
		vipMemberService.login();
		vipMemberService.deleteMe();
		vipMemberService.logout();
		
		VipMemberService vipMemberService2 = new VipMemberServiceImpl();
		vipMemberService2.receiveVip();
		
	}
}
