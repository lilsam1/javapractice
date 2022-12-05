package ch_05_array;

public class Array_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for(int i = 0; i < number.length ; i++) {
			number[i] = i;	//배열을 0-9의 숫자로 초기화
			System.out.print(number[i] + " ");	//0 1 2 3 4 5 6 7 8 9
		}
		
		System.out.println();
		
		for(int i = 0; i < 10000; i++ ) {
			// Math.random() : 0.0 이상 1.0 미만의 double 값의 난수를 규닝한 분포로 반환
			int n = (int)(Math.random() * 10);
			// System.out.println(Math.random);
			// System.out.println((int)(Math.random() * 11));
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		//System.out.println(temp);
		for(int i = 0; i <number.length; i++) {
			System.out.print(number[i] + " ");	//배열의 내용을 출력
		}

	}

}
