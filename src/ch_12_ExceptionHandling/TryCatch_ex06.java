package ch_12_ExceptionHandling;

public class TryCatch_ex06 {
	// ������ ���Ḧ �ϴµ� try catch�� �̿��Ͽ� ���ܸ� �����ϰ� ó���ϵ��� �ڵ带 ����

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
