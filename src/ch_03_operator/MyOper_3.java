package ch_03_operator;

public class MyOper_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 복합 증감연산자
		
		int i = 5;
		int j = 0;
		j = i++;	// 1.j = i; 	2.i = i + 1;
		System.out.println("j = i++; 실행 후, i=" + i +", j="+ j); //
		
		//결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		i = 5;
		j = 0;
		j = ++i;	// 1.i = i + 1; 	2.j = i;
		System.out.println("j = ++i; 실행 후, i=" + i +", j="+ j); //

	}

}
