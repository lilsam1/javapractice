package ch_05_array;

public class Array_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최대값, 최초값 구하기
		
		int[]score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];	//배열의 첫 번째 값으로 최대값을 초기화
		int min = score[0];	//배열의 첫 번째 값으로 최소값을 초기화
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}	//end of for
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
