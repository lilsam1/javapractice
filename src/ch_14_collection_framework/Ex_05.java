package ch_14_collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 아이디와 비밀번호 검사하기
 아이디와 비밀번호 입력을 받아 map에 저장된 값과 비교를 해서
 1) 동일한 아이디 비번이 있는 경우에는 "로그인되었습니다"
 2) 동일한 아이디는 있는데 비번이 틀린 경우 "비밀번호가 일치하지 않습니다"
 3) 동일한 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다"가 출력되도록 해라 
 */

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();	// 키와 값으로 String 사용
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			// 작성위치
			if(map.containsKey(id)) {	// 아이디인 키가 존재하는지 확인
				if (map.get(id).equals(password)) {	// 키가 id인 value와 입력한 비밀번호 문자열 비교
					System.out.println("로그인 되었습니다");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}

	}

}
