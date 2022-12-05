package ch_12_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = ".\\sample_file\\test.text";	// 이스케이프 문자 \를 이용하여 \\로 나타냄
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path);
			System.out.println("지정한 경로에 파일이 존재합니다");
		} catch(FileNotFoundException e) {
			System.out.println("지정한 경로에 파일이 존재하지 않습니다");
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {;}
				System.out.println("파일을 닫았습니다");
			}
			System.out.println("자원을 해제하고 종료합니다");
		}

	}

}
