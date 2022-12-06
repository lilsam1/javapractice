package ch_14_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex01 {

	// String 객체를 저장하는 ArrayList - 
	// 데이터 추가 삭제가 적은 경우 사용 ex) 인덱스 넘버가 1000을 넘는데 2번 인덱스에 추가를 하면 그 뒤로 한칸씩 다 밀려나오기 떄문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();	// 저장된 총 객체수 얻기
		System.out.println("총 객체수: " + size);	// 총 객체수: 5
		System.out.println();
		
		String skill = list.get(2);	// 2번 인덱스에 저장된 객체 얻기
		System.out.println("2: " + skill);	// 2: Database
		System.out.println();
		
		// 저장된 객체 출력
		for (int i = 0; i < list.size(); i++) {	// 저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
//		0:Java
//		1:JDBC
//		2:Database
//		3.Serverlet/JSP
//		4.iBATIS
		
		System.out.println();
		for(String str : list) {	// foreach로도 출력가능
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2);	// 2번 인덱스 Database 삭제
		list.remove(2);	// 2번 인덱스 Serverlet/JSP 삭제
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {	// 저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
//		0:Java
//		1:JDBC

	}

}
