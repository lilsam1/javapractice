package ch_04_control;

public class If_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		
		if (age > 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		else { // ���� ���ǽ��� �����϶��� ����}
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");

		//���׿�����
		System.out.println((age > 19 ? "�����Դϴ�. \n���� ����� ����˴ϴ�." : "û�ҳ��Դϴ�. \nû�ҳ� ����� ����˴ϴ�."));
		System.out.println("������ ������ �ּ���.");
	}

}
