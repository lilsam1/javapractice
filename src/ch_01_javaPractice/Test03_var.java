package ch_01_javaPractice;

public class Test03_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڸ� ���ڷ�
		char ch = 'A';  //char ch = '\u0041';�� �ٲ� �ᵵ ����
		int code = (int)ch;  //ch�� ����� ���� int������ ��ȯ�Ͽ� ����
		System.out.println(ch); //A
		System.out.println(code); //65
		
		// ���ڸ� ���ڷ�
		int codeA = 97; //�Ǵ� int codeA = 0x0061;
		char chA = (char)codeA;
		System.out.println(codeA);
		System.out.println(chA);


	}

}
