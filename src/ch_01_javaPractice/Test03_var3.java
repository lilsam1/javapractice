package ch_01_javaPractice;

public class Test03_var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 표현
		char single = '\'';	// single = ''';와 같이 할 순 없음, \를 쓰면 출력가능
		String dblQuote = "\"Hello\"";	//겹따옴표를 출력하려면 이렇게
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		//char은 단 하나의 문자만 저장, 여러 문자를 저장하려면 String 사용
		//char은 ' 로만 묶임
		//String은 클래스, " 로만 묶어야 함
//		char single2 = '""';		//에러
		String single3 = "'";
		String dblQuote2 = "'Hello'";
//		String dblQuote3 = 'Hello'; //에러
		
		System.out.println(single3);
		System.out.println(dblQuote2);
	}

}
