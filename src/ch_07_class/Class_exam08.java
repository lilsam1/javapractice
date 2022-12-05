package ch_07_class;

public class Class_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 사람의 은행계좌 데이터를 취급하는 프로그램
		// 어떤 경우 클래스를 사용하는지 이 코드를 기반으로 class 생성
		
		String chulsooAccountName = "철수";		// 철수의 계좌명의
		String chulsooAccountNo = "123456";		// 철수의 계좌번호
		long chulsooAccountBalance = 1000;		// 철수의 예금잔고
		
		String youngheeAccountName = "영희";		// 영희의 계좌명의
		String youngheeAccountNo = "654321";	// 영희의 계좌번호
		long youngheeAccountBalance = 200;		// 영희의 예금잔고
		
		chulsooAccountBalance -= 200;			// 철수가 200원을 인출
		youngheeAccountBalance += 100;			// 영희가 100원을 예금
		
		System.out.println("ㅁ 철수의 계좌");
		System.out.println("  계좌명의 : " + chulsooAccountName);
		System.out.println("  계좌번호 : " + chulsooAccountNo);
		System.out.println("  예금잔고 : " + chulsooAccountBalance);
		System.out.println();
		
		System.out.println("ㅁ 영희의 계좌");
		System.out.println("  계좌명의 : " + youngheeAccountName);
		System.out.println("  계좌번호 : " + youngheeAccountNo);
		System.out.println("  예금잔고 : " + youngheeAccountBalance);

	}

}
