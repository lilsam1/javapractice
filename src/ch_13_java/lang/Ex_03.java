package ch_13_java.lang;

import java.util.HashMap;

/* Students 클래스를 작성하되, Object의 equlas()와 hashCode()를 재정의해서
  Students의 학번 studentNum 이 같으면 동등 객체가 될 수 있도록 해보세요
  Students 클래스의 필드는 다음과 같습니다.
  hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴 하도록 하세요
 */

class Students {
	private String studentNum;
	
	public Students(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	// 코드 작성
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Students) {	// 동일한 클래스의 객체이면
			Students student = (Students)obj;	// Student 클래스로 형변환
			if(studentNum.equals(student.getStudentNum()))	// 이 객체의 학번과 매개변수로 넘어온 객체의 학번이 같으면 true 반환
				return true;
		}
		return false;
	}
	}
	
	


public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Students, String> hashMap = new HashMap<Students, String>();
		
		// new Student("1")의 점수 95를 저장
		hashMap.put(new Students("1"), "95");
		
		String score = hashMap.get(new Students("1"));
		System.out.println("1번 학생의 총점 : " + score);

	}

}
