package ch_13_java.lang;

/*
 long currentTimeMillis()
 �ý����� ���� �ð��� ����
 ����Ǵ� ���� �츮�� ���� ���� �ð� ������ �ƴ϶�
 1970�� 1�� 1�� ������ �������� ����� ���� Ÿ�� Epoch time �̸� ������ 1/1000��
 �ð� ������ ������ ���� Ÿ���� long Ÿ��
 
 ��� �ð��̾ �ð� ��������� ����ϱ� ���� ������ ������ �� ���� ���� ���� ������ �ַ� ���
 */

public class System_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ��� �� �� ����ϴµ� �ɸ��� �ð��� ����
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			System.out.println(i + "���� ��");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " �� �ɸ�");

	}

}
