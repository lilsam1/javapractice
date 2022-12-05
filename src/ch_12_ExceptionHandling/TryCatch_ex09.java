package ch_12_ExceptionHandling;

import java.io.*;
import java.util.*;

public class TryCatch_ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;		// 파일 error.log에 출력할 준비
		FileOutputStream fos = null;	// 파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true);
			ps = new PrintStream(fos);	// err의 출력을 화면이 아닌 error.log 파일로 변경
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생
			System.out.println(4);		// 실행 되지 않는다
		}
		catch (Exception ae) {
			System.err.println("---------------------------");
			System.err.println("예외 발생 시간: " + new Date());	// 현재시간출력
			ae.printStackTrace(System.err);
			System.err.println("예외메세지: " + ae.getMessage());
			System.err.println("---------------------------");
		}	// try-catch의 끝
		System.out.println(6);
	}

}
