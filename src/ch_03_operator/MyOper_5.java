package ch_03_operator;

public class MyOper_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �� ������
		 */
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		// ���ڿ��� ��� equals() �޼��带 �̿��� ���� ��
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello Java!")); //false
		System.out.println(c1.equals("Hello JAVA!")); //true
		
		// ==�� ��ü�� �ּҰ��� ��
		System.out.println(c1 == "Hello Java!"); //false
		System.out.println(c1 == "Hello JAVA!"); //true

	}

}
