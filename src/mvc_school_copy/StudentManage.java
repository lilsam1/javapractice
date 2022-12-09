package mvc_school_copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
	private Scanner input;
	private ArrayList<Student> students;
	
	public StudentManage() {
		input = new Scanner(System.in);
		students = new ArrayList<Student>();
	}
	
//	Scanner input = new Scanner(System.in);
//	ArrayList<Student> students = new ArrayList();
	static String[] className = {"JAVA", "PYTHON", "C"};
	
	Student findStudentInform(int studentNumber) {
		for (Student student : students) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("�ش� �л��� ������ ������ �����ϴ�");
				System.out.println("�̸� : " + student.getName());
				System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
				System.out.println("�޸� : " + student.getMemo());
				return student;
			}
		}return null;
	}
	
	// 1. �л� �߰� �� ����
	public void addStudent() {
		System.out.print("�л��� �й��� �Է� �ϼ��� >>>");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		// �Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent);	// �л� ��ü�� ArrayList�� ����
		}
		
		System.out.print("�̸��� �Է� �ϼ��� >>>");
		newStudent.setName(input.next());	// ���ڿ� �Է¹޾� setName�� ����
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� >>>");
		newStudent.setPhoneNumber(input.next());
		System.out.print("�޸� �Է��ϼ��� >>>");
		newStudent.setMemo(input.next());
		
		System.out.println("�л� �߰��� �Ϸ�Ǿ����ϴ�" + "\n");
	}
	
	// 2. �л� ���� �޴�
	public void removeStudent() {
		System.out.print("�л��� �й��� �Է��ϼ��� >>>");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {	// ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�");
			return;	// �޼��� ����
		}
		
		students.remove(newStudent);	// �ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�");
	}
	
	// 3. ������û �޴�
	public void addClass() {
		System.out.println("�л��� �й��� �Է��ϼ��� >>>");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {	// ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�");
			return; // �޼��� ����
		}
		
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					setClass("������û �� ������ �����ϼ���", newStudent, true);
					break;
				case 2:
					setClass("�������� �� ������ �����ϼ���", newStudent, false);
					break;
				case 3:
					return;
			}
		}
	}
	
	public void setClass(String message, Student newStudent, boolean check) {
		// TODO Auto-generated method stub
		System.out.println(message);
		System.out.println("1.JAVA/ 2. PYTHON / 3. C");
		int index = input.nextInt() - 1 ;
		newStudent.setClassCheck(index, check);
		
		if(!check) {	// �������� �� �����̶��
			newStudent.setClassScore(index, 0);	// ������ 0���� �ǵ���
		}
		
	}

	// 4. ���� �Է� �޴�
	public void setScore() {
		System.out.print("�л��� �й��� �Է��ϼ��� >>>");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {	// ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�");
			return;	// �޼��� ����
		}
		
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ��� 1. JAVA / 2. PYTHON / 3. C / 4. ����");
			int classMenu = input.nextInt();
			if(classMenu == 4) {	// ���� üũ
				break;	// while�� ����
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {	// �̽�û üũ
				System.out.println(className[classMenu-1] + "������ �̽�û �����Դϴ�");
				continue;	// �̽�û�̱� ������ ó������ ���ư���
			}
			System.out.print("������ �Է��ϼ��� >>>");
			int score = input.nextInt();
			if(score < 0 || score > 100) {	// ������ 0 ~ 100 �������� üũ
				System.out.println("Error : ������ 0���� 100 ���� ���ڸ� �Է��� �ּ���");
				continue;	// ó������ ���ư�
			}
			// �������� ����� ������ �Է��� �� ���
			newStudent.setClassScore(classMenu-1, score);	// �ش� �л��� Score�� ������Ʈ �Ѵ�
			System.out.println(className[classMenu-1] + "���� �Է��� �Ϸ�Ǿ����ϴ�");	// ���
		}
	}
	
	// 5. �л� ���� ���� �޴�
	public void informStudent() {
		System.out.println("�޴��� ���� ���ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // Ư�� �л��� ���� ����
			One();
			break;
		case 2:	// ��ü �л��� ���� ����
			All();
			break;
		}
	}
	
//	public void fas() {
//		int studentNubmer ;
//		Student newStudent = findStudentInform(studentNumber);
//		System.out.println("�й� : " + newStudent.getStudentNumber());
//		System.out.println("�̸� : " + newStudent.getName());
//		System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
//		System.out.println("�޸� : " + newStudent.getMemo());
//		System.out.println("���� �������� ����� ���� >>>");
//		boolean[] classCheck = newStudent.getClassCheck();
//		int[] classScore = newStudent.getClassScore();
//		for (int i = 0; i < classCheck.length; i++) {
//			if (classCheck[i]) {
//				System.out.println("�����:" + className[i] + " / ���� : " + classScore[i]);
//			}
//		}
//	}
	
	public void One() {
		System.out.println("�л��� �й��� �Է��ϼ���");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {	// ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�");
			return;	// �޼��� ����
		}
		
		System.out.println("�й� : " + newStudent.getStudentNumber());
		System.out.println("�̸� : " + newStudent.getName());
		System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
		System.out.println("�޸� : " + newStudent.getMemo());
		System.out.println("���� �������� ����� ���� >>>");
		boolean[] classCheck = newStudent.getClassCheck();
		int[] classScore = newStudent.getClassScore();
		for (int i = 0; i < classCheck.length; i++) {
			if (classCheck[i]) {
				System.out.println("�����:" + className[i] + " / ���� : " + classScore[i]);
			}
		}
	}
	
	public void All() {
		for (Student newStudent : students) {
			System.out.println("�й� : " + newStudent.getStudentNumber());
			System.out.println("�̸� : " + newStudent.getName());
			System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
			System.out.println("�޸� : " + newStudent.getMemo());
			System.out.println("���� �������� ����� ���� >>>");
			boolean[] classCheck = newStudent.getClassCheck();
			int[] classScore = newStudent.getClassScore();
			for (int i = 0; i < classCheck.length; i++) {
				if (classCheck[i]) {
					System.out.println("�����:" + className[i] + " / ���� : " + classScore[i]);
				}
			}
		}
	}

	
}
