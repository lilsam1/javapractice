package ch_06_method;

public class CallByString_exam01 {
	// ���ڿ��� ���� ȣ�� ���
	// ���������� ���ڿ��� �����Ϸ��� ������ �����Ͷ� ���� ���� ȣ���� ��
	public void setAddress(String addr) {
		addr = "��⵵ ������ ��ȱ�";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "����� ������ ������";
				
		CallByString_exam01 st = new CallByString_exam01();
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("adress: " + address);	//address : ����� ������ ������
		
		st.setAddress(address);
		
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("adress: " + address); 	// adress : ����� ������ ������

	}

}
