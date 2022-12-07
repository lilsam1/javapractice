package ch_14_collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;	// treeSet 선언
	
	public MemberTreeSet(){
		treeSet = new TreeSet<Member>();	// treeSet 생성
	}
	
	public void addMember (Member member) {
		treeSet.add(member);	// treeSet에 회원 추가
	}
	
	public boolean removeMember(int memberID) {	// treeSet에서 회원 삭제
		Iterator<Member> ir = treeSet.iterator();	//iterator를 활용해 순회
		
		while(ir.hasNext()) {
			Member member = ir.next();	// 회원을 하나씩 가져와
			int tempId = member.getMemberID();	// 아이디 비교
			if(tempId == memberID) {	// 같은 아이디일 경우
				treeSet.remove(member);	// 회원 삭제
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {	// 모든 회원 출력
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
