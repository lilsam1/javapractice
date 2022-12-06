package ch_14_collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new MemberShip("홍길동", 30));
		set.add(new MemberShip("홍길동", 30));
		
		System.out.println("총 객체수: " + set.size());	// 1

	}

}
