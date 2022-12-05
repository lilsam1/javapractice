package ch_01_javaPractice;

public class Test03_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자를 숫자로
		char ch = 'A';  //char ch = '\u0041';로 바꿔 써도 같다
		int code = (int)ch;  //ch에 저장된 값을 int형으로 변환하여 저장
		System.out.println(ch); //A
		System.out.println(code); //65
		
		// 숫자를 문자로
		int codeA = 97; //또는 int codeA = 0x0061;
		char chA = (char)codeA;
		System.out.println(codeA);
		System.out.println(chA);


	}

}
