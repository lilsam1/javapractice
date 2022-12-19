package ch_18_input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		파일 끝까지 읽기
		read() 메서드로 파일을 읽는 경우 파일의 끝에 도달을 하면 -1을 반환
		*/
		try(FileInputStream fis = new FileInputStream("./sample_file/input.txt")) {
			int i;
			// i 값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해서 읽음
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
