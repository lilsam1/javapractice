package ch_14_collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 HashSet에 Student 객체를 저장할려고 한다
 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않게 하라
 Student 클래스를 만들어라 
 */

class Student {
	int studentNum;
	String name;
	
	Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentNum == student.studentNum)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}


public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));	// 학번이 같아서 저장되지 않음
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}

	}

}
