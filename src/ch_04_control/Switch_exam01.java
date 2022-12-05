package ch_04_control;

public class Switch_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch문
		 조건식의 해당하는 케이스로 이동 후 실행
		 */
		
		
		// 일년 동안 읽은 책 수에 따라 멘트를 출력
		int book = 15;
		book = book / 10;
		switch(book) {
		case 0:	//10권 미만	//case는 라벨. 블록 요소 X 
			System.out.println("조금 더 노력하세요");
			break;	
			//break 없으면 밑으로 계속 실행
		case 1: //10이상 20권 미만
			System.out.println("책 읽는 것을 즐기는 분이시네요");
			break;
		case 2: //20이상 30권 미만
			System.out.println("책을 사랑하는 분이시네요");
			break;
		default: //30권 이상
			System.out.println("당신은 다독왕입니다");
		}

	}

}
