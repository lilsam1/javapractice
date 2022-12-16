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
					setClass("������û�� ������ �����ϼ���", student, true);
					break;
				case 2:
					setClass("���������� ������ �����ϼ���", student, false);
					break;
				case 3:
					System.out.println("���θ޴��� ���ư��ϴ�");
					return;
			}
		}
	}
	
	public void setClass(String message, Student student, boolean check) {
		System.out.println(message);
		ArrayList<Subject> subjects = subjectDAO.selectAll();
		for (Subject s : subjects) {
			System.out.println(s.getCode() + "." + s.getSubjectName() + "/ ");
		}
		System.out.println();
		int code = input.nextInt();
		
		Course course = new Course(student.getStudentNumber(), code);
		if (check) {	// ������û
			if (courseDAO.isCourse(course)) {
				System.out.println("�̹� ������û�� �����Դϴ�");
			}
			else {
				if (!courseDAO.insertCourse(course)) {
					System.out.println("���� ��û�� �����߽��ϴ�");
				}
				else {
					System.out.println("���� ��û�� �����߽��ϴ�");
				}
			}
		}
		else {	// �������
			if (!courseDAO.isCourse(course)) {
				System.out.println("������û�� ������ �ƴմϴ�");
			}
			else {
				if (!courseDAO.deleteCourse(course)) {
					System.out.println("���� ��ҿ� �����߽��ϴ�");
				}
				else {
					System.out.println("���� ��ҿ� �����߽��ϴ�");
				}
			}
		}
	}

	// 4. ���� �Է� �޴�
	public void setScore() {
		System.out.print("�л��� �й��� �Է��ϼ��� >>>");
		int studentNumber = input.nextInt();	// �й� �Է¹���
		
		Student student = studentDAO.selectOne(studentNumber);
		if (student == null) {
			System.out.println("�ش�Ǵ� �й��� �����ϴ�");
			return;
		}
		else {
			while(true) {
				System.out.println("������ �Է�/������ ������ �����ϼ���");
				ArrayList<Subject> subjects = subjectDAO.selectAll();
				for (Subject s : subjects) {
					System.out.println(s.getCode() + "." + s.getSubjectName() + "/ ");
				}
				System.out.println("0. ����");
				System.out.println();
				int code = input.nextInt();
				if(code == 0) {	// ���� üũ
					break;	// while �� ����
				}
				
				Course course = new Course(studentNumber, code);
				if (!courseDAO.isCourse(course)) {
					System.out.println("������û�� ������ �ƴմϴ�");
				}
				else {
					System.out.println("������ �Է��ϼ��� >>> ");
					int score = input.nextInt();
					if (score < 0 || score > 100) {
						System.out.println("ERROR : ������ 0���� 100 ���� ���ڸ� �Է��� �ּ���");
						continue;	// ó������ ���ư�
					}
					course.setScore(score);
					if (!courseDAO.updateScore(course)) {
						System.out.println("���� �Է��� ���� �߽��ϴ�");
					}
					else {
						System.out.println("���� �Է��� �Ϸ� �Ǿ����ϴ�");
					}
				}
			}
		}
		
	}
	
	
	// 5. �л� ���� ���� �޴�
	
	public void informStudent() {	// ���
		System.out.println("�޴��� �������ּ���. 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // Ư�� �л��� ����
			One();
			break;
		case 2:	// ��ü �л��� ����
			All();
			break;
		}
	}
	
	public void One() {
		System.out.print("�л��� �й��� �Է��ϼ���");
		int studentNumber = input.nextInt();	// �й� �Է�
		
		Student student = studentDAO.selectOne(studentNumber);
		if (student == null) {
			System.out.println("�ش�Ǵ� �й��� �����ϴ�");
			return;
		}
		else {
			System.out.println("�й� : " + student.getStudentNumber());
			System.out.println("�̸� : " + student.getName());
			System.out.println("����ó : " + student.getPhoneNumber());
			System.out.println("�޸� : " + student.getMemo());
			System.out.println("���� �������� ����");
			ArrayList<Course> courses = courseDAO.selectAllByStudentNumber(studentNumber);
			for (Course c : courses) {
				System.out.println("����� : " + subjectDAO.selectOne(c.getCode()).getSubjectName() + " / ���� : " + c.getScore());
			}
			
		}
	}
	
	public void All() {
		ArrayList<Student> students = studentDAO.selectAll();
		for (Student student : students) {
			System.out.println("�й� : " + student.getStudentNumber());
			System.out.println("�̸� : " + student.getName());
			System.out.println("����ó : " + student.getPhoneNumber());
			System.out.println("�޸� : " + student.getMemo());
			System.out.println("���� �������� ����");
			ArrayList<Course> courses = courseDAO.selectAllByStudentNumber(student.getStudentNumber());
			for (Course c : courses) {
				System.out.println("����� : " + subjectDAO.selectOne(c.getCode()).getSubjectName() + " / ���� : " + c.getScore());
			}
			System.out.println();
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
