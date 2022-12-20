package ch_18_input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_ex01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		Write(byte[] b) 메서드 사용하기
		출력도 입력과 마찬가지로 여러 자료를 한꺼번에 출력하면 효율적일 뿐더러 실행시간도 줄어듬
		write(byte[] b) 메서드는 바이트 배열에 있는 자료를 한꺼번에 출력 
		 */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output2.txt")){
			byte[] bs = new byte[26];
			byte data = 65;		// 'A'의 아스키 값
			for(int i = 0; i < bs.length; i++) {	// A-Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs);	// 배열 한꺼번에 출력
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}

}
