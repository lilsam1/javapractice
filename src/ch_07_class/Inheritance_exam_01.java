package ch_07_class;

/*
 public : 접근 제한이 없음
 protected : 같은 패키지 내에서의 자손 클래스에서 접근 가능
 default : 같은 패키지 내에서만 접근 가능
 private : 같은 클래스 내에서만 접근 가능
 */

class User {
	private String name;
	private int age;
	
	User(String name, int age) {	// 매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}

}

public class Inheritance_exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("철수", 20); // 인스턴스 생성
		User user2 = new User("영희", 19); // 인스턴스 생성
		
//		user2.age = 1000;	// 에러발생. 직접 접근 불가
		
		user2.setAge(20);
		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
		

	}

}