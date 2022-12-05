package ch_07_ex_student1;

import java.util.Scanner;

public class Student {
	/*
	 Student Ŭ������ �����Ͻÿ�
	 �̸� name, �� ban, ��ȣ no �� �Է¹޴� �����ڸ� ����ÿ�
	 ���� kor, ���� eng, ���� math ������ �Է¹޴� updateRecord() �޼��带 �ۼ��Ͻÿ�
	 �л��� �̸��� ��ȯ�ϴ� getName(), �Է¹��� ������ �հ踦 ���ϴ� getTotal(), ����� ��ȯ�ϴ� getAverage()�� �ۼ��Ͻÿ�
	 */
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;


	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	void updateRecord(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (kor + eng + math)/3.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		
		System.out.println("�̸�: " + s.getName());
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());

	}

}
