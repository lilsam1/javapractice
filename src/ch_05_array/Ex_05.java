package ch_05_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 가위바위보 게임
		 1) 가위, 바위, 보는 각각 정수형 1, 2, 3으로 간주한다
		 2) 컴퓨터가 제시할 가위바위보 데이터를 만든다
		 3) 게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 한다.
		 4) 현재 횟수/ 총 횟수와 함께 입력 메세지를 출력한다
		 5) 키보드로 1, 2, 3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다.
		 6) 비긴 경우에는 횟수에 포함되지 않는다
		 7) 게임을 종료하면 누가 이겼는지 표시한다. 
		 */
		/*
		 사용자가 이기는 경우
		 컴 : 사용자
		 1 : 2
		 2 : 3
		 3 : 1
		 
		 사용자가 지는 경우
		 컴 : 사용자
		 2 : 1
		 3 : 2
		 1 : 3
		 */

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		String[] gameImtems = {"가위","바위","보"}; // 출력을 위해 문자열
		int[] results = new int[2];	// 게임 결과를 저장. 누가 이겼는지 저장 0: 사용자 이김
		String[] resultStrs = {"사용자가 이김", "컴이 이김"}; //출력을 위한 문자열
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(3) + 1;	//1-3까지 랜덤하게 정수 반환
		}
//		System.out.println(Arrays.toString(numbers)); //1-3 랜덤하게 잘 나오는지 확인
		
		for (int i = 0, answer; i < numbers.length; i++ ) {
			System.out.println((i+1) + " / " + numbers.length + " 입니다. 가위(1), 바위(2), 보(3) 중 하나를 입력");
			answer = scanner.nextInt();
			System.out.print(gameImtems[answer -1] + "를 입력하셨고, 컴은 " + gameImtems[numbers[i] - 1 ] + "를 입력. ");
			if (answer == numbers[i]) {	// 비긴 경우
				System.out.println("비겼습니다");
				i--; //i 값이 바뀌지 않게
			}
			else if ((answer + 1) % 3 == numbers[i] % 3) {
				results[1]++;
				System.out.println("컴이 이겼습니다");
			}
			else {
				results[0]++;
				System.out.println("사용자가 이겼습니다");
			}
		}
		
		int max = results[0];
		int maxIndex = 0;
		for (int i = 0; i < results.length; i++) {
			if (max < results[i]) {
				max = results[i];
				maxIndex = i;
			}
		}
		System.out.println("게임 결과는 " + resultStrs[maxIndex]);
		
		
		
		
		/*안됨..
		Scanner input = new Scanner(System.in);
		
		int win=0,lose=0,draw=0,fail=0; //게임결과값 변수
		String coin;//게임횟수 변수
		
		System.out.print("가위바위보를 실행합니다.(5번):");		
		int coinInt = 5;

		//GAME START
		System.out.println("===============GAME START================");
		System.out.println("어떤걸 내시겠습니까? 가위[1] 바위[2] 보[3]");
		
		
		for(int i=0;i<coinInt;i++) {
			String npc="", user=""; //컴퓨터와 사용자의 가위,바위,보 선택 변수
			int computer = (int) Math.ceil(Math.random()*3);
			
			while (!input.hasNextInt()) { //값이 숫자인지 판별,입력값이 숫자가 아니라면 while문 실행
				input.next();//값이 숫자가 아니면 버린다.
	            System.out.println("숫자를 입력해주세요.");
	            System.out.println("=========================================");
			}
			String userInput = input.next();//사용자의 입력값
		    int userInputInt=Integer.parseInt(userInput);
		    //유저의 가위바위보
		    switch(userInputInt) {
		    	case 1:
		    		user = "가위";
		    		break;
		    	case 2:
		    		user = "바위";
		    		break;
		    	case 3:
		    		user = "보";
		    		break;
		    	default:
		    		user="오류";
		    }
		    //컴퓨터의 가위바위보
		    switch(computer) {
		    	case 1:
		    		npc = "가위";
		    		break;
		    	case 2:
		    		npc = "바위";
		    		break;
		    	case 3:
		    		npc = "보";
		    		break;
		    	default:
		    		npc="시스템 오류";
		    }
		
		    System.out.println("[유저] "+user+" =VS= "+npc+" [컴퓨터]");
		    
		    //가위바위보 승패 설정
		    if(userInputInt >= 1 && userInputInt <= 3) {//유저의 가위바위보 입력값이 1~3일 때만
		        //가위=1,바위=2,보=3
		    	if((computer == 1 && userInputInt == 2) || (computer == 2 && userInputInt == 3) || (computer == 3 && userInputInt ==1)) {//유저가 이긴경우
		            win++;
		            System.out.println("[승리]");
		       }else if(computer == userInputInt) {//무승부인경우
		    	   	draw++;
		            System.out.println("[무승부]");
		        }else {
		            lose++;
		            System.out.println("[패배]");
		        }
		    }else {//오류상황
		        fail++;
		        System.out.println("값을 잘못 입력 하였습니다.");    
		    }
		    System.out.println("=========================================");
		}
		*/

	}

}
