package ch_05_array;

public class Array_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 초기화 및 출력
		int[][] arr = {
						{1, 2, 3},
						{4, 5, 6}
					  }; // 2차원 배열 선언
		
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
