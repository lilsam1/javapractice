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
			System.out.println("1.�Է��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			System.out.print("�۾��� ��ȣ�� �����ϼ���.: ");
			num = scn.nextInt();
			
			if(num < 1 || num > 3)
			{
				if( num == 4)
				{
					break;
				}
				menu = "�߸�";
			}
			else
			{
				if(num == 1)
				{
					menu = "�Է��ϱ⸦";
				}
				else if(num == 2)
				{
					menu = "����ϱ⸦";
				}
				else if(num == 3)
				{
					menu = "�����ϱ⸦";
				}
			}
			System.out.printf("\n%s �����Ͽ����ϴ�.\n\n", menu);
			
		}while(num != 4);
		
		System.out.print("\n�����⸦ �����Ͽ����ϴ�.");
	}

}
