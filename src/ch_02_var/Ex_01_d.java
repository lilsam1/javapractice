package ch_02_var;

public class Ex_01_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int result = ��1) ���� 4���� ��� ����ϰ� 2)��Ģ������ + ���길 ����ؼ�
		   9�� �������� �ڵ� �ϼ�
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		

		
		
//		int result = ; //�� �κи� ����. 0��� �ڵ� �Է�
//		System.out.println(result); //9

		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
			//	or	 (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
			//	or	 (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
			//	or	 (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
		System.out.println(result);
	}

}
