package mvc_school_db;

import java.util.ArrayList;
import java.util.Scanner;

import mvc_account._db.AccountDTO;
import mvc_book_db.Book;
import mvc_book_db.BookDAO;

public class StudentManage {
	String[] className = {"JAVA", "PYTHON", "C"};
	
	private ArrayList<Student> students;
	private Scanner input;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private CourseDAO courseDAO;
	
	public StudentManage() {
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
		courseDAO = new CourseDAO();
		students = new ArrayList<Student>();
		input = new Scanner(System.in);
	}
	
	public void disConnect() {
		studentDAO.disConnect();
		subjectDAO.disConnect();
		courseDAO.disConnect();
	}
	
	private Student findStudentInform(int studentNumber) {
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
	
	// 1. �л� �߰�
	public void addStudent() {
		Student student = new Student();
		
		System.out.print("�л��� �й��� �Է��ϼ��� ");
		student.setStudentNumber(input.nextInt());
		
		System.out.print("�̸��� �Է��ϼ���");
		student.setName(input.next());
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� ");
		student.setPhoneNumber(input.next());
		
		System.out.println("�޸� �Է��ϼ���");
		student.setMemo(input.next());
		
		if(studentDAO.insertStudentNumber(student)) {
			System.out.println("�л� �߰��� �Ϸ�Ǿ����ϴ�");
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}
	
	// 2. �л� ���� �޴�
	public void removeStudent() {
		Student student = new Student();
		
		System.out.print("�л��� �й��� �Է��ϼ��� >>>");
		student.setStudentNumber(input.nextInt());	// �й� �Է¹���
		
		if(studentDAO.deleteStudentNumber(student)) {
			System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�");
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	
	}
	
	// 3. ������û �޴�
	public void addClass() {
		System.out.println("�й��� �Է��ϼ���");
		System.out.print("�й� : ");
		int studentNumber = input.nextInt();
		
		Student student = studentDAO.selectOne(studentNumber);
		if (student == null) {
			System.out.println("�ش�Ǵ� �й��� �����ϴ�");
			return;
		}
		
		while(true) {
			System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					System.out.println("������û�� �����ڵ带 �Է��ϼ���");
					break;
				case 2:
					System.out.println("���������� �����ڵ带 �Է��ϼ���");
					break;
				case 3:
					System.out.println("���θ޴��� ���ư��ϴ�");
					return;
			}
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
	
	public void informStudent() {	// ���
		System.out.println("�޴��� �������ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // Ư�� �л��� ����
			System.out.println("��ȸ�� �л��� �й��� �Է��ϼ���");
			System.out.print("�й� : ");
			int studentNumber = input.nextInt();
			
			Student student = studentDAO.selectOne(studentNumber);
			if (student != null) {
				System.out.println();
				System.out.println("�̸� : " + student.getName() + "\n" + "����ó : " + student.getPhoneNumber() + "\n" + "��ϻ��� : " + student.getMemo() + "\n" + "�й� : " + student.getStudentNumber() + "\n");
			}
			else {
				System.out.println("�ش� �й��� �л��� �������� �ʽ��ϴ�");
			}
			break;
		case 2:	// ��ü �л��� ����
			ArrayList<Student> list = studentDAO.selectAll();
			for (Student student1 : list) {
				System.out.println("�̸� : " + student1.getName() + "\n" + "����ó : " + student1.getPhoneNumber() + "\n" + "��ϻ��� : " + student1.getMemo() + "\n" + "�й� : " + student1.getStudentNumber() + "\n");
			}
			break;
		}
	}
	
	
	
	// 6. �������� ����
	public void management() {
		System.out.println("�޴��� ���� ���ּ���. 1. ������ ��ȸ�մϴ� / 2. ������ �߰��մϴ� / 3. ������ �����մϴ� / 4. ����");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // ���� ��ȸ
			ArrayList<Subject> list = subjectDAO.selectAll();
			for (Subject subject : list) {
				System.out.println(subject.getCode() + "\t" + subject.getSubjectName() + "\t");
			}
			break;
		case 2:	// ���� �߰�
			Subject subject = new Subject();
			
			System.out.print("�߰��Ϸ��� ������ �ڵ带 �Է��ϼ��� ");
			subject.setCode(input.nextInt());
			
			System.out.print("���� �̸��� �Է��ϼ���");
			subject.setSubjectName(input.next());
			
			if(subjectDAO.insertCode(subject)) {
				System.out.println("���� �߰��� �Ϸ�Ǿ����ϴ�");
			}
			else {
				System.out.println("�ٽ� �Է����ּ���");
			}
			break;
		case 3:	// ���� ����
			Subject subject1 = new Subject();
			
			System.out.print("�����Ϸ��� ������ �ڵ带 �Է��ϼ��� >>>");
			subject1.setCode(input.nextInt());	// �й� �Է¹���
			
			if(subjectDAO.deleteCode(subject1)) {
				System.out.println("���� ������ �Ϸ�Ǿ����ϴ�");
			}
			else {
				System.out.println("�ٽ� �Է����ּ���");
			}
			break;
		case 4:	// ���θ޴���
			System.out.println("���θ޴��� ���ư��ϴ�");
			return;
		
		}
	}
	

	
}
