package ch_02_var;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����
		   int result = ��1) ���� 4���� ��� ����ϰ� 2)��Ģ������ + ���길 ����ؼ�
		   9�� �������� �ڵ� �ϼ�
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		
		int value1 = (int)var1;
		
		int value2 = (int)var2;

		int value3 = (int)var3;
				
		//String -> double
		double value4 = Double.parseDouble(var4);
		int value5 = (int)value4;

		int result = value1 + value2 + value3 + value5;
		System.out.println(result);
		
		
		
		// ��
//		int result = ; //�� �κи� ����. 0��� �ڵ� �Է�
//		System.out.println(result); //9�� ��������

	}

}
