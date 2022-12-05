package ch_13_java.lang;

public class String_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ٸ� ���α׷��� ���� ���ڿ��� ������ �� char[] �迭�� ���
		 �ڹٴ� String Ŭ������ ������ char[] �迭�� ���� �������� �ʾƵ� ���ڿ��� ����� �� ����
		 
		 String Ŭ������ ���� ������ ���� private final char value[] ��� ����� char �迭�� ����
		 ���α׷����� String s = new String("abc")��� ���� abc�� String Ŭ������ value ������ ������ ��
		 value ���� final�� ������ �Ǿ� �־ ���� ������ �� ����. �̸� �Һ� immutable �̶�� ��
		 
		 ���α׷����� �� ���� ���ڿ��� �����ϸ� �� �� �ϳ��� ���ڿ��� ����Ǵ°� �ƴ϶� �� ���ڿ��� ����� ���ο� ���ڿ��� ź��
		 */
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);	// java
		System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));	// ó�� ���ڿ� �ּ� ��: 1586600255 
		
		javaStr = javaStr.concat(androidStr);	// java�� android ���ڿ��� ����
		
		System.out.println(javaStr);	// javaandroid
		System.out.println("����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));	// ����� ���ڿ� �ּ� ��: 474675244
		
//		// ���ڿ��� ���� �����ϴ� ���
//		javaStr = "new java";
//		System.out.println(javaStr);	// new java
//		System.out.println("���� ������ ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));	// ���� ������ ���ڿ� �ּ� ��: 107456312


	}

}
