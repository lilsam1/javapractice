package ch_04_control;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for���� �̿��ؼ� ������ ���� *�� ����ϴ� �ڵ带 �ۼ�
		
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
