package ch_14_collection_framework;

import java.util.HashSet;

/*
 출력 결과가 다음처럼 나오도록 Member1 클래스를 구현하세요
 [400:정약용, 100:김유신, 200:강감찬, 300:이순신]
 출력 순서는 상관 없습니다 
 */
class Member1 {
	String num;
	String name;
	
	Member1(String num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.num.hashCode();
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num + ':' + name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj instanceof Member1) {
			Member1 member = (Member1) obj;
			if (this.num.equals(member.num)) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
			
	
}

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Member1> set = new HashSet<Member1>();
		set.add(new Member1("100", "김유신"));
		set.add(new Member1("200", "강감찬"));
		set.add(new Member1("300", "이순신"));
		set.add(new Member1("400", "정약용"));
		set.add(new Member1("100", "홍길동"));
		
		System.out.println(set);

	}

}
