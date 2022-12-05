package ch_05_array;

public class Array_exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열
		// 1차원 배열을 선언하는 부분에 []를 하나 더 추가
		String[][]name;

		// 1차원 배열이 1층 짜리 건물에 방이 들어 있는 구조라면
		// 2차원 배열은 각 층에 방이 들어 있는 구조로 이해하면 이해가 쉬움
		// ex_   apart[3][2] = 4층 3번째방 = 403호 
		
		int[][]student = new int[3][4];
		// 2차원 배열은 행과 열로 구성. 첫번째 괄호의 인덱스는 행, 두번쨰 괄호의 인덱스는 열을 의미
		// 3행 4열
		// 총 개수는 12개
		
		student[1][2] = 30; //2행 3열에 30저장
		
		//2차원 배열을 초기화할 때 - 행을 구분하기 위해 괄호를 한 번 더 사용
//		int[][]student = {{100,200,300},{400,500,600},{700,800,900},{10,20,30}};

	}

}
