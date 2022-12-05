package ch_05_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���������� ����
		 1) ����, ����, ���� ���� ������ 1, 2, 3���� �����Ѵ�
		 2) ��ǻ�Ͱ� ������ ���������� �����͸� �����
		 3) ������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �Ѵ�.
		 4) ���� Ƚ��/ �� Ƚ���� �Բ� �Է� �޼����� ����Ѵ�
		 5) Ű����� 1, 2, 3 �� �ϳ��� �Է��ϰ�, ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰���� �˷��ش�.
		 6) ��� ��쿡�� Ƚ���� ���Ե��� �ʴ´�
		 7) ������ �����ϸ� ���� �̰���� ǥ���Ѵ�. 
		 */
		/*
		 ����ڰ� �̱�� ���
		 �� : �����
		 1 : 2
		 2 : 3
		 3 : 1
		 
		 ����ڰ� ���� ���
		 �� : �����
		 2 : 1
		 3 : 2
		 1 : 3
		 */

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		String[] gameImtems = {"����","����","��"}; // ����� ���� ���ڿ�
		int[] results = new int[2];	// ���� ����� ����. ���� �̰���� ���� 0: ����� �̱�
		String[] resultStrs = {"����ڰ� �̱�", "���� �̱�"}; //����� ���� ���ڿ�
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(3) + 1;	//1-3���� �����ϰ� ���� ��ȯ
		}
//		System.out.println(Arrays.toString(numbers)); //1-3 �����ϰ� �� �������� Ȯ��
		
		for (int i = 0, answer; i < numbers.length; i++ ) {
			System.out.println((i+1) + " / " + numbers.length + " �Դϴ�. ����(1), ����(2), ��(3) �� �ϳ��� �Է�");
			answer = scanner.nextInt();
			System.out.print(gameImtems[answer -1] + "�� �Է��ϼ̰�, ���� " + gameImtems[numbers[i] - 1 ] + "�� �Է�. ");
			if (answer == numbers[i]) {	// ��� ���
				System.out.println("�����ϴ�");
				i--; //i ���� �ٲ��� �ʰ�
			}
			else if ((answer + 1) % 3 == numbers[i] % 3) {
				results[1]++;
				System.out.println("���� �̰���ϴ�");
			}
			else {
				results[0]++;
				System.out.println("����ڰ� �̰���ϴ�");
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
		System.out.println("���� ����� " + resultStrs[maxIndex]);
		
		
		
		
		/*�ȵ�..
		Scanner input = new Scanner(System.in);
		
		int win=0,lose=0,draw=0,fail=0; //���Ӱ���� ����
		String coin;//����Ƚ�� ����
		
		System.out.print("������������ �����մϴ�.(5��):");		
		int coinInt = 5;

		//GAME START
		System.out.println("===============GAME START================");
		System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
		
		
		for(int i=0;i<coinInt;i++) {
			String npc="", user=""; //��ǻ�Ϳ� ������� ����,����,�� ���� ����
			int computer = (int) Math.ceil(Math.random()*3);
			
			while (!input.hasNextInt()) { //���� �������� �Ǻ�,�Է°��� ���ڰ� �ƴ϶�� while�� ����
				input.next();//���� ���ڰ� �ƴϸ� ������.
	            System.out.println("���ڸ� �Է����ּ���.");
	            System.out.println("=========================================");
			}
			String userInput = input.next();//������� �Է°�
		    int userInputInt=Integer.parseInt(userInput);
		    //������ ����������
		    switch(userInputInt) {
		    	case 1:
		    		user = "����";
		    		break;
		    	case 2:
		    		user = "����";
		    		break;
		    	case 3:
		    		user = "��";
		    		break;
		    	default:
		    		user="����";
		    }
		    //��ǻ���� ����������
		    switch(computer) {
		    	case 1:
		    		npc = "����";
		    		break;
		    	case 2:
		    		npc = "����";
		    		break;
		    	case 3:
		    		npc = "��";
		    		break;
		    	default:
		    		npc="�ý��� ����";
		    }
		
		    System.out.println("[����] "+user+" =VS= "+npc+" [��ǻ��]");
		    
		    //���������� ���� ����
		    if(userInputInt >= 1 && userInputInt <= 3) {//������ ���������� �Է°��� 1~3�� ����
		        //����=1,����=2,��=3
		    	if((computer == 1 && userInputInt == 2) || (computer == 2 && userInputInt == 3) || (computer == 3 && userInputInt ==1)) {//������ �̱���
		            win++;
		            System.out.println("[�¸�]");
		       }else if(computer == userInputInt) {//���º��ΰ��
		    	   	draw++;
		            System.out.println("[���º�]");
		        }else {
		            lose++;
		            System.out.println("[�й�]");
		        }
		    }else {//������Ȳ
		        fail++;
		        System.out.println("���� �߸� �Է� �Ͽ����ϴ�.");    
		    }
		    System.out.println("=========================================");
		}
		*/

	}

}
