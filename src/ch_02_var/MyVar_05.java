package ch_02_var;

public class MyVar_05 {
	/*���꿡���� ���ڿ� �ڵ� ��ȯ
	 +�����ڴ� �� ���� ���
	 1)�ǿ����ڰ� ������ ��쿡�� ���� ����
	 2)�ǿ����� �� �ϳ��� ���ڿ��̸� ������ �ǿ����ڵ� ���ڿ��� �ڵ� ��ȯ�Ǿ ���ڿ� ���� ������ ����
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ����
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); //20
		
		//���� ���� ����
		String strl = 10 + 2+ "8";
		System.out.println("strl : " + strl); //128;
		// �����ڴ� ���ʿ��� ���������� ������� ���� �Ǳ� ������
		// 12 + "8"�� ��
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); // 1028 : "102" + 8
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4 ); //1010 : "10" + 10 ��ȣ�� ���� ���

	}

}