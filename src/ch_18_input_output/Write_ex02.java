package ch_18_input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Write(byte[] b, int off, int len) 메서드 사용하기
		배열의 전체 자료를 출력하지 않고 배열의 off위치 부터 len 길이만큼만 출력 
		 */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output3.txt")){
			byte[] bs = new byte[26];
			byte data = 65;		// 'A'의 아스키 값
			for(int i = 0; i < bs.length; i++) {	// A-Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);	// 배열의 2번쨰 위치부터 10개 바이트 출력하기
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}

}
