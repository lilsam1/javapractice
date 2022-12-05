package ch_06_method;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰 수는 " + max(a, b, c)+ "입니다.");
		System.out.println(a+ ", " + b + " 중에 제일 큰 수는 " + max(a, b) + "입니다.");
	}
	static int max(int a, int b, int c) {	// a, b, c의 최대값을 반환
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		return max;
	}
	static int max(int a, int b) {	//a, b의 최대값을 반환
		int max = a;
		if (a < b) max = b;
		return max;
	}

}
