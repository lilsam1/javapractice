package ch_05_array;

public class Array_exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2���� �迭 ���� �� ���
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("��: " + arr.length); // 2
		System.out.println("��: " + arr[0].length); // 3

	}

}
