package ch_14_collection_framework;

import java.util.TreeSet;

public class TreeSet_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		treeSet.add("������");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		// ������������ ���� �Ǿ� ���
		/*
		 ������
		 �̼���
		 ȫ�浿
		 */

	}

}
