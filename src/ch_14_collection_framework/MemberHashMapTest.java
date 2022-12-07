package ch_14_collection_framework;

public class MemberHashMapTest {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손한국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);	// 회원 아이디 (key 값)가 1004인 회원 삭제
		memberHashMap.showAllMember();


	}

}
