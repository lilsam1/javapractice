package ch_12_ExceptionHandling;

public class TryCatch_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println("arr[2] = " + arr[2]);
			System.out.println("arr[3] = " + arr[3]);	// ���� �߻�
			System.out.println("arr ��� �Ϸ�");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("���� �߻� : catch �� ����");
		} finally {
			System.out.println("try/catch ���� �� ���� ����");
		}

	}

}
