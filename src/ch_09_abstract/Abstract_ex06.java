package ch_09_abstract;

abstract class Student {
	public String name;	// �̸�
	public int grade;	// �г�
	 String teacher;
	
	public Student() {
		System.out.println("Student ������ ȣ��");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	public String getStudInfo() {
		System.out.println("Student Ŭ������ getStudInfo() �޼��� ȣ��");
		
		return "�̸��� : " + name + " , �г��� " + grade;
	}
	
	// �л��� ���Ӽ������� �̸��� ���ϴ� �޼���
	public abstract String getTeacher();
}
	

class Elementary extends Student {
	public Elementary(String name, int grade) {
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
	}
	
	// �߰�
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher= teacher;
	}
	
	public Elementary() {
		this("�̼���", 3);
		System.out.println("Elementary ������ ȣ��");
	}
	

	@Override
	// �ʵ��б� ���Ӽ������� ���ϴ� �޼���
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "��� ������: " +  super.teacher;
	}
}

class University extends Student {
	private int courses;	// ��û �л�
	
	public University(String name, int grade, int course) {
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
//	�߰�
	public University(String name, int grade, int course, String teacher) {
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		super.teacher = teacher;
	}
	
	
	public University() {
		this("�̼���",2,20);
	}
	
	public int getCourses() {
		return courses;
	}
	
	// overriding �޼���
	public String getStudInfo() {
		System.out.println("University Ŭ������ getStudInfo �޼��� ȣ��");
		return "�̸���>> " + name + ", �г���>> " + grade + ", ��û ������>> " + courses;
	}
	
	// ���� ������ �̸��� ���ϴ� �޼���
	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "��� ������:" + super.teacher;
	}
}

public class Abstract_ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���� �����ڰ� Student ���� Ŭ������ ����鼭 �л��� ��� �����̳� ������ ���ϴ� �޼���
		 getTeacher()�� �������, �� �����ڿ��� �������̵��� �϶�� ��Ŵ
		 ������ ������ �����ڰ� ��ü�Ǿ� �ش� ������Ʈ�� �ͼ����� ���� ���
		 �������� ���ø� �߸� �����ؼ� Elementary, University Ŭ���� ���۽ÿ�
		 ����� ���������� �̸��� �ٸ� �޼��带 ����� ��
		 �� �Ŀ� �ٸ� �����ڵ��� ���� Student�� ����� Ŭ������ ���ϼ��� �Ҿ������ ��
		 ���� ���α׷��� ������ �����ڰ� �� ����� �˾Ƽ� �����ϴ� �� ���ٴ�
		 ������Ʈ�� �Ը� ���� Ŀ���Ƿ� ���� ���������� ������ ���ؼ���
		 ������ ���� �ҽ��� �����ϰ�, �ҽ��� ������ �����ϰ� �����ؾ� �� �ʿ伺�� ����
		 ������ �̷� ������� �������̵��� �����ϸ� �����ڰ� ���Ƿ� �ҽ��� ������ �� �ֱ� ������ ���ϼ��� �Ҿ���� �� ����
		 
		 �ش� �ҽ��� �߻�Ŭ������ �����ؼ� �������̵��� �������� �ο��� ��
		 ��ü ������ ��� ������ ������ �Է��ϴ� �����ڸ� �߰��� ��
		 */
		
		University university = new University ("ȫ�浿",3,22,"������");
		Elementary elementary = new Elementary("�̼���", 2 ,"ȫ��");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		for (Student s : students) {
			System.out.println("�л� �̸�:" + s.getName());
			System.out.println(s.getTeacher());
			
		}
		/*
		 �л� �̸�:ȫ�浿
		 ��� ������:������
		 �л� �̸�:�̼���
		 ��� ������:ȫ��
		 */

	}
}


