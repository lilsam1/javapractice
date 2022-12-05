package ch_12_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\sample_file\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("파일 열기 성공");
		} catch(FileNotFoundException e) {
			// 다형성을 이용한 예외 처리
			System.out.println("*** FileNotFoundException ***");
			//e.printStackTrace();
		} catch(IOException e) {
			System.out.println("*** IOException ***");
		} catch(Exception e) {
			System.out.println("*** Exception ***");
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}

	}

}
