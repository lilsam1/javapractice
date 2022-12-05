package ch_12_ExceptionHandling;

public class TryCatch_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println("arr[2] = " + arr[2]);
			System.out.println("arr[3] = " + arr[3]);	// 예외 발생
			System.out.println("arr 출력 완료");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("예외 발생 : catch 문 수행");
		} finally {
			System.out.println("try/catch 구문 밖 문장 수행");
		}

	}

}
