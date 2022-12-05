package shoppingmall_notend;

import java.util.Scanner;

public class MemberInsert extends Member {
	Scanner stdin = new Scanner(System.in);

	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
		// TODO Auto-generated constructor stub
	}
	
	public void updateAddInfo() {
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.println("추가 정보를 입력하시려면 Y, 그만하실려면 N을 입력해 주십시요>>>");
		String yn = stdin.nextLine();
		if(yn.equals("y")) {
			System.out.println("주소를 입력해주십시오>>> ");
			String address = stdin.nextLine();
			this.setAddress(address);
			System.out.println("이메일을 입력해주십시오>>> ");
			String email = stdin.nextLine();
			this.setEmail(email);
		}
		if(yn.equals("n")) {  }	
	}
	
	public void printMemberInfo() {
																									//		Member m = new Member(this.getMemberID(), "address", "address");	// bullshit
		System.out.println(this.toString());
	}
	

	void login() {
		System.out.println("로그인 정보를 입력해 주세요");
		System.out.println();
		System.out.println("아이디를 입력해 주세요 >>>");
		String memberID = stdin.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String password = stdin.nextLine();
		
		if(super.getMemberID() == this.getMemberID() && super.getPassword() == this.getPassword() ) {
			System.out.println("로그인에 성공하였습니다");
		}
	}

}
