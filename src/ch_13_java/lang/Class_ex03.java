package ch_13_java.lang;

/*
 void exit(int status)
 ���� ���μ����� ���� ����
 �μ��� ���� Ÿ���� ���� �ڵ鸣 ����
 �������� ����� 0�� �����ϰ� �����߻��ÿ� -1�� �����ϴ� ���� ����
 �Ǵ� ȣ����� ����Ͽ� �ǹ� �ִ� ������ ������ ���� ����
 ���� Ư������ �����ϴ� ���μ������ ������� ���� �ڵ�� �����ϴ� ��
 */

public class Class_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���α׷� ���� exit()
		 exit() �޼���� ���� ����ǰ� �ִ� ���μ����� ���� ���� ��Ű�� ����
		 int �Ű� ���� �����ϵ��� �Ǿ� �ִµ�, �� ���� ���� ���� �� �̶�� �ϰ�, �Ϲ������� ���� ������ ��� 0 ���� ��
		 */
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if ( i == 5) {
				System.exit(0);
			}
		}
		System.out.println("������ �ڵ�");

	}

}
