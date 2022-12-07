package ch_14_collection_framework;

// MemberShip 객체를 중복 없이 저장하는 HashSet
// hashCode()와 equals() 메서드를 재정의 하지 않으면 저장된 객체가 2개

public class MemberShip {
	/* hashCode()와 equals() 메서드 재정의 */
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode()와 equals() 메서드 재정의

	@Override
	public boolean equals(Object obj) {	// name과 age 값이 같으면 true 리턴
		// TODO Auto-generated method stub
		// name과 age 값이 같으면 true 반환
		if (obj instanceof MemberShip) {	// 참조변수 obj가 실제로 참조하고 있는 인스턴스의 타입이 MemberShip 클래스 타입이면 true를 반환
			MemberShip memberShip = (MemberShip) obj;
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// name과 age 값이 같으면 동일한 hashcode 반환
		return name.hashCode() + age;	// String의 hashCode() 이용
	}

	

}
