package ch_05_array;

public class Ex_02Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구하세요
		// 각 행의 열의 갯수가 다른 경우
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성위치
		
		System.out.println("sum : " + sum); // 881
		System.out.println("avg : " + avg); // 88.1

	}

}
