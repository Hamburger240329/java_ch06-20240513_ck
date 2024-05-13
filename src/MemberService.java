
//public class MemberService {
//	public MemberService(String id, String password) {
//		if (id == "hong" & password == "12345") {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//	}
//	
//	public logout(String id) {
//		
//	}
//	
//	
//	String id = "hong";
//	int password = 12345;
//	
// }


public class MemberService {
	
	public boolean login(String id, String password) {
		if ((id.equals("hong")) && (password.equals("12345"))) {
			return true;
	}	else {
		return false;
	}
}
	public void logout(String id) {
		System.out.println("로그 아웃 되었습니다.");
	}
}