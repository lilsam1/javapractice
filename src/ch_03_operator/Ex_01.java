package ch_03_operator;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� �� ���� ���� �� �ְ�
		 ���������� �� ���� ������ ���ϴ� �ڵ�.
		 16,20���� �� 1 ��ſ� �˸��� �ڵ带 �ۼ��Ͻÿ�
		 */
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
