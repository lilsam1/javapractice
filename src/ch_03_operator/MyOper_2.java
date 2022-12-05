package ch_03_operator;

public class MyOper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 증감 연산자
		 단독으로 사용하지 않는 경우에는 전위, 후위에 따라 결과 값이 다름
		 */
		int i = 5, j = 5;
		System.out.println(i++); //5
		//순서 1.print i;		2.i = i + 1;-> 출력 후 증가
		System.out.println(++j); //6
		//순서 1.j = j + 1	2.print j;	-> 증가 후 출력
		System.out.println("i = " + i + ", j = " + j);	//6 6
		//실행 후에는 동일한 값

	}

}
