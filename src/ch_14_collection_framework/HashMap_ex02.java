package ch_14_collection_framework;

import java.util.HashMap;
import java.util.Map;

class Student1 {	// 학번과 키가 같다면 동일한 키로 인식
	public int sno;
	public String name;
	
	public Student1(int sno, String name) {	
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {	// 학번과 이름이 같다면 동일한 값을 리턴
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 학번과 이름이 같다면 true를 반환
		// TODO Auto-generated method stub
		if (obj instanceof Student1) {
			Student1 student = (Student1) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		else {
			return false;
		}
	}
}

public class HashMap_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student1, Integer> map = new HashMap<Student1, Integer>();
		
		// 학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student1(1, "홍길동"), 95);
		map.put(new Student1(1, "홍길동"), 95);
		map.put(new Student1(1, "박유신"), 85);
		
		System.out.println("총 Entry 수 : " + map.size());	// 저장된 총 Map.Entry 수 얻기

	}

}
