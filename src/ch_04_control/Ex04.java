package ch_04_control;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성
		
		   *
		  **
		 ***
		****
		
		*/
		
		
		for (int i = 1; i <=4; i++) {
			for(int j =  4; j >0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (4- i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
