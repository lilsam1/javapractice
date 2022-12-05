package ch_12_ExceptionHandling;

public class TryCatch_ex06 {
	// 비정상 종료를 하는데 try catch를 이용하여 예외를 안전하게 처리하도록 코드를 수정

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		try { 
			for(int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}
		} catch(IndexOutOfBoundsException e) { 
				System.out.println(e.getMessage());
		}
	}

}
