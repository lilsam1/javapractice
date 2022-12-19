package ch_18_input_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OuputStream_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FileOutputStream : ���Ͽ� ����Ʈ ���� �ڷḦ ����ϱ� ���� ����ϴ� ��Ʈ�� 
		
		FileOutputStream(String name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����
		FileOutputStream(String name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ�� ����
		append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
		
		FileOutputStream(File f) : FileŬ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����
		FileOutputStream(File f, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����
		append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
		
		������ �Ű������� ������ ������ ��ο� ������ FileOutputStream�� ������ ���� ����
		���� ������ �ִ� ��� append ���� false�̸� ó������ ���� ��. overwrite
		true�̸� ���� ���� �� �ڿ� �����ؼ� ��. append
		*/
		
		// FileOutputStream�� �����ϰ� write() �޼��带 Ȱ���Ͽ� ���Ͽ� ���� ���� ����
		// fos = new FileOutputStream("output.txt", true) ���� �ڷῡ �̾ ����� ���
		try(FileOutputStream fos = new FileOutputStream("./output_file/output.txt")) {
			// ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ
			fos.write(65);	// A
			fos.write(66);	// B
			fos.write(67);	// C
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�");
	}
}
