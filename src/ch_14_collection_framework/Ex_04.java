package ch_14_collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 HashMap�� ���̵�(String)�� ����(Integer)�� ����Ǿ� ����
 ���� ����� ���� ��� ������  ����ϰ�, �ְ������� �ְ������� ���� ���̵� ����� ��
 */

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	// �ְ� ������ ���� ���̵� ����
		int maxScore = 0;	// �ְ� ���� ����
		int totalScore = 0;	// ���� �հ� ����
		
		
		// �ۼ� ��ġ ����
		Iterator<String> entrySet = map.keySet().iterator();
		while (entrySet.hasNext()) {	// �ݺ��ؼ� Ű�� ��� ���� Map���� �˾Ƴ�
			String key = entrySet.next();
			int thisScore = map.get(key);
			totalScore += map.get(key);
			if (maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		System.out.println("��� ���� : " + totalScore / map.size());
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		

		/*
		 ��� ���� : 91
		 �ְ� ���� : 96
		 �ְ� ������ ���� ���̵� : blue
		  
		 */

	}

}
