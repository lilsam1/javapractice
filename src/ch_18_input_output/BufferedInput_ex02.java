package ch_18_input_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInput_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 복사하기
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
			FileOutputStream fos = new FileOutputStream("./output_file/copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			millisecond = System.currentTimeMillis();	// 파일 복사를 시작하기 전 시간
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;	// 파일을 복사하는데 걸리는 시간
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 복사하는데 " + millisecond + "milliseconds 소요되었습니다");
	}

}
