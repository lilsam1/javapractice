package ch_06_method;

public class method_exam12 {
	/* �޼��� �������� �޼��� ȣ��
	�޼��忡�� �ٸ� �޼��带 ȣ���ϸ� �޼���� ������ ���߰� �ٸ� �޼��尡 ������ �� ���� ��ٸ�
	ȣ���� �޼��尡 ����Ǹ� ������ �ڵ尡 ������ ��
	main() => fisrtMethod() => secondMethod()
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���.");
		secondMethod();
		System.out.println("fisrstMethod()�� ������.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���");
		System.out.println("secondMethod()�� ������");
	}

}
