package ch_05_array;

public class Array_exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열 선언 및 출력
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("행: " + arr.length); // 2
		System.out.println("열: " + arr[0].length); // 3

	}

}
