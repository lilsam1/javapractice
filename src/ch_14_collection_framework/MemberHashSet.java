package ch_14_collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;	// HashSet 선언
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();	// HashSet에 생성
	}
	
	public void addMember (Member member) {
		hashSet.add(member);	// HashSet에 회원 추가
	}
	
	public boolean removeMember(int memberID) {
		// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		Iterator<Member> ir = hashSet.iterator();	//iterator를 활용해 순회
		
		while(ir.hasNext()) {
			Member member = ir.next();	// 회원을 하나씩 가져와
			int tempId = member.getMemberID();	// 아이디 비교
			if(tempId == memberID) {	// 같은 아이디일 경우
				hashSet.remove(member);	// 회원 삭제
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {	// 모든 회원 출력
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
