package ch_14_collection_framework;

import java.util.HashSet;

/*
 ��� ����� ����ó�� �������� Member1 Ŭ������ �����ϼ���
 [400:�����, 100:������, 200:������, 300:�̼���]
 ��� ������ ��� �����ϴ� 
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
		set.add(new Member1("100", "������"));
		set.add(new Member1("200", "������"));
		set.add(new Member1("300", "�̼���"));
		set.add(new Member1("400", "�����"));
		set.add(new Member1("100", "ȫ�浿"));
		
		System.out.println(set);

	}

}
