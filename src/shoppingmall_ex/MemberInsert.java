package shoppingmall_ex;

import java.util.Scanner;

public class MemberInsert {
	Scanner stdin = new Scanner(System.in);
	Member member;
	MemberInsert(String memberID, String password, String name) {
		member = new Member(memberID, password, name);
	}
	
	 void updateAddInfo() {
		boolean isMore = true;
		 
		System.out.println("추가 정보를 입력하시겠습니까?");
		do {
			System.out.println("추가 정보를 입력하시려면 Y, 그만하실려면 N을 입력해 주십시요>>>");
			String answer = stdin.nextLine();
			if(answer.equals("Y") || answer.equals("N")) {
				isMore = false;
				if (answer.equals("Y")) {
					System.out.println("주소를 입력해주십시오>>> ");
					String address = stdin.nextLine();
					member.setAddress(address);
					System.out.println("이메일을 입력해주십시오>>> ");
					String email = stdin.nextLine();
					member.setEmail(email);	
				}
			} else {
				System.out.println("잘못된 입력입니다");
			}
		} while (isMore);
		}
	
	void printMemberInfo() {																						//		Member m = new Member(this.getMemberID(), "address", "address");	// bullshit
		System.out.println(member);
	}
	

	void login() {
		String memberID, password;
		System.out.println("로그인 정보를 입력해 주세요");
		do {
			System.out.println("아이디를 입력해 주세요 >>>");
			memberID = stdin.nextLine();
			System.out.println("비밀번호를 입력해 주세요");
			password = stdin.nextLine();
		}
		while (!confirmLogin(memberID, password));
		}
	
	private boolean confirmLogin(String memberID, String password) {
		if (member.getMemberID().equals(memberID) && member.getPassword().equals(password)) {
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다");
			return false;
		}
	
	}

}
