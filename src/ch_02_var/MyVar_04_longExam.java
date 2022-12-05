package ch_02_var;

public class MyVar_04_longExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long형을 사용할 경우, int의 범위를 벗어난 경우 접미사 L을 사용
		//숫자가 적을 땐 접미사를 붙여도 되고 안 붙여도 됨
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일 에러
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
