package ch_05_array;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 배열을 이용하여 랜덤으로 조편성을 해보기
		 학생 수는 27명
		 한 조의 인원은 3명으로.
		 
		 */
		String[] students = {"김대환","김정원","김준혁","김지혜","김혜현","박기훈","박성민","박소희","박정혜","박준휘","배규","손하늘","신용화","오범수","오원택","오해준",
				"유수현","육승민","이기행","이성호","이승재","이영주","장명규","장윤영","주민석","최현지","황희윤"};
		
		
		/*인덱스 번호 이용한 방법
		int numberPerTeam = 3;
		int count = 0;
		
		// 셔플
		for(int i = 0; i < 10000; i++ ) {
			int n = (int)(Math.random() * students.length);
			String temp = students[0];
			students[0] = students[n];
			students[n] = temp;
		}
		
		for (int i = 0; i < students.length; i++) {
			if ((i + 1) % numberPerTeam == 1) {
				System.out.println( ++ count + "조: ");
			}
			System.out.println(students[i] + " ");
			if ((i + 1) % numberPerTeam == 0) {
				System.out.println();
			}
		}
		*/
		
		
		/*
		//2차 배열 이용 방법
		String team[][] = new String[9][3];
		int count = 0;
		
		for (int i = 0; i < team.length; i++) {
			System.out.print((i+1) + "조: ");
			if(i<9) {
				for(int j=0; j<team[i].length;) {
					int k = (int)(Math.random()*27);
					
					if(!students[k].equals("x")) {
						team[i][j] = students[k];
						System.out.print(team[i][j] + " ");				
						students[k] = "x";
						j++;
					}
				}
				System.out.println();
			}
		}
		*/
		
		// (1) 27명으로 이루어진 반 학생들을 담을 member배열 생성
		// (2) String타입의 27(9x3)개 빈공간을 담을 team배열 생성
		String team[][] = new String[9][3];
		int count = 0;
		
		for (int i = 0; i < team.length; i++) {
			System.out.print((i+1) + "조: ");
			if(i<9) {
				for(int j=0; j<team[i].length;) {
					int k = (int)(Math.random()*27);
					
					if(!students[k].equals("x")) {
						team[i][j] = students[k];
						System.out.print(team[i][j] + " ");				
						students[k] = "x";
						j++;
					}
				}
				System.out.println();
			}
		}
	

	}

}
