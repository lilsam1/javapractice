package ch_05_array;

import java.util.Arrays;

public class Ex_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 번호 구하기
		// 1 - 45까지의 임의의 수 구하기
		// 중복 되는 것 있는지 체크
		
		int[] ball = new int[45];
				
		for(int i = 0; i < ball.length ; i++)
			ball[i] = i + 1;	//ball[0]에 1이 저장
			
		// 배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정
		// 배열의 첫 번쨰 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
		for(int i = 0; i < 10000; i++ ) {
			int j = (int)(Math.random() * 45);
			
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		//System.out.println(temp);
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		
		System.out.println( );
		System.out.println( );
		
		// 추가로 생각해볼 것 - 필요한 숫자는 6개인데 45개씩이나 되는 번호를 만들어 메모리 공간을 쓸 필요가 있는가
		// 간략하게 줄여보기
		int range = 6;
		int[] numbers = new int[range];
		
		while(range > 0) {
			int temp = (int)(Math.random() * 45) + 1; //1-45의 임의의 값을 얻는다
			
			//중복확인
			boolean result = true; // 중복 확인 값을 저장하기 위한 변수. 중복이면 false
			for(int n : numbers) {
				if(n == temp) { // 중복이 되면 result 값 변경
//					System.out.println(temp + "은 중복된 값입니다");
					result = false;
				}
			}
			
			if (result) {
				numbers[range-1] = temp;
				range--;
			}
			
		}
		System.out.println(Arrays.toString(numbers));

	}

}
