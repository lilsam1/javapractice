package ch_04_control;

public class Switch_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String medal = "Silver";
		
		switch(medal) {
		case "Gold" :
			System.out.println("금메달 입니다");
			break;
		case "Silver" :
			System.out.println("은메달 입니다");
			//해당되는 라벨로 건너뛰어서 실행
			//break 안쓰면 뒤에까지 실행
			break;
		case "Bronze" :
			System.out.println("동메달 입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
			break;
			
		}

	}

}
