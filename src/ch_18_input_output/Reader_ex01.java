package ch_18_input_output;

import java.io.FileReader;
import java.io.IOException;

public class Reader_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FileReader
		FileReader(String name) : 파일 이름 name(경로 표함)을 매개변수로 받아 입력 스트림을 생성
		FileReader(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림을 생성
		
		문자 스트림 FileReader로 읽으면 한글이 제대로 읽힘
		*/
		
		try(FileReader fr = new FileReader("./sample_file/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
