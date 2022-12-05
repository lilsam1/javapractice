package ch_04_control;

import java.util.Scanner;

public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int num;
		String menu = "";
		
		do
		{
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요.: ");
			num = scn.nextInt();
			
			if(num < 1 || num > 3)
			{
				if( num == 4)
				{
					break;
				}
				menu = "잘못";
			}
			else
			{
				if(num == 1)
				{
					menu = "입력하기를";
				}
				else if(num == 2)
				{
					menu = "출력하기를";
				}
				else if(num == 3)
				{
					menu = "삭제하기를";
				}
			}
			System.out.printf("\n%s 선택하였습니다.\n\n", menu);
			
		}while(num != 4);
		
		System.out.print("\n끝내기를 선택하였습니다.");
	}

}
