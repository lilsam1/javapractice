package ch_07_class;

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm
	
	static int cv = 5;	// Ŭ���� ����
	int iv = 4;			// �ν��Ͻ� ����
	
	static void cm() {	// Ŭ���� �޼���
	}
	
	void im() {			// �ν��Ͻ� �޼���	
	}
	
	static void cm_Imember() {	// Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
//		System.out.println(iv);	// ���� �߻�
//		im();					// ���� �߻�
		
	}
	
	void im_Cmember() {			// �ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmember() {	// Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {			// �ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}

public class Class_instance_exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
