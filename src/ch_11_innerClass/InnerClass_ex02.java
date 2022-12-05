package ch_11_innerClass;

class OuterClass {
	int a = 3;
	static int b = 4;
	
	class Inner  {	// �ν��Ͻ� ���� Ŭ����
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner {	// static ���� Ŭ����
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class InnerClass_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܺ� Ŭ���� ���
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass�� �� = " + oc.a);	// 3
		
		// static ������ Ŭ���������� ���� ����
		System.out.println("OuterClass�� b�� = " + OuterClass.b);		// 4
//		System.out.println("OuterClass�� b�� = " + OuterClass.StaticInner.d);	//���� �Ұ�
		System.out.println("OuterClass�� StaticInner�� stat�� = " + OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod();	// <Static Inner>	// Ŭ���������ε� ���� ����
		
		System.out.println("\n====== inner Ŭ���� �����ϱ� =======");
		OuterClass oc2 = new OuterClass();	// �ܺ� Ŭ������ ��ü ���� �� ���
		OuterClass.Inner inner = oc2.new Inner();	// �ν��Ͻ� ���� Ŭ������ ��ü ����
		
		System.out.println("Inner�� c�� = " + inner.c);	// 5
		inner.innerMethod();	// <Inner Class>
		
		System.out.println("\n====== static inner Ŭ���� �����ϱ� =======");
		OuterClass.StaticInner si = new OuterClass.StaticInner();	// static ���� Ŭ������ ��ü ����
		System.out.println("StaticInner�� d�� = " + si.d);	// 6
		si.staticMethod();	// <Static Inner> Ŭ����, ��ü ��θ� ����� ���� ����

	}

}