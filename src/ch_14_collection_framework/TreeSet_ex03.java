package ch_14_collection_framework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 �Ϲ������� Comparator �������̽� ���ٴ� Comparable �������̽��� �� ���� ���
 �ٸ� � Ŭ������ �̹� Comparable �������̽��� ������ ��� �� Ŭ������ ���� ����� ������ �� Comparator �������̽��� ���
 String Ŭ������ Comparable �������̽��� �����߰� CompareTo()�޼���� ���������� ���� 
 */
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2)) * -1 ;	// String Ŭ������ compareTo() �޼��带 �ݴ��
//		return s1.compareTo(s2);
	}
	
}

public class TreeSet_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set<String> set = new TreeSet<String>();
		// TreeSet �����ڿ� Comparator�� ������ ��ü�� �Ű������� ����
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);	// [ccc, bbb, aaa]

	}

}
