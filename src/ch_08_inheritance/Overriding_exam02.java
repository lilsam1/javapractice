package ch_08_inheritance;

class MyParent{
	void pDisplay (){
		System.out.println("super: Parent's Display");
	}
}

class MyChild extends  MyParent {
	// ���� Ŭ������ �޼��带 ������
	@Override
	void pDisplay() {
		// TODO Auto-generated method stub
		super.pDisplay();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("sub Class: child's Display");
	}
	
}

public class Overriding_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild c = new MyChild();
		c.pDisplay();	// �����ǵ� ���� Ŭ������ �޼��带 ȣ��
		/*
		 super : parent's Display
		 sub class: parent's Display
		 */

	}

}
