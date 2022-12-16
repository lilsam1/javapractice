package ch_17_java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
 Date와 SimpleDateFormat 클래스를 이용해서 오늘의 날짜를 아래와 같이 출력하는 프로그램을 작성
 
 실행 결과 :
 2022년 08월 22일 월요일 18시 09분
 */

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String pattern = "yyyy년 MM월 dd일 E요일 HH시 mm분";
		SimpleDateFormat p = new SimpleDateFormat(pattern);
		System.out.println(p.format(date));
		
		// 코드 줄이기
		SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(pattern1.format(new Date()));
				

	}

}
