package ch_01_javaPractice;

public class Test03_var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ� ǥ��
		char single = '\'';	// single = ''';�� ���� �� �� ����, \�� ���� ��°���
		String dblQuote = "\"Hello\"";	//�����ǥ�� ����Ϸ��� �̷���
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		//char�� �� �ϳ��� ���ڸ� ����, ���� ���ڸ� �����Ϸ��� String ���
		//char�� ' �θ� ����
		//String�� Ŭ����, " �θ� ����� ��
//		char single2 = '""';		//����
		String single3 = "'";
		String dblQuote2 = "'Hello'";
//		String dblQuote3 = 'Hello'; //����
		
		System.out.println(single3);
		System.out.println(dblQuote2);
	}

}
