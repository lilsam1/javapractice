package ch_17_java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
 Date�� SimpleDateFormat Ŭ������ �̿��ؼ� ������ ��¥�� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ�
 
 ���� ��� :
 2022�� 08�� 22�� ������ 18�� 09��
 */

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String pattern = "yyyy�� MM�� dd�� E���� HH�� mm��";
		SimpleDateFormat p = new SimpleDateFormat(pattern);
		System.out.println(p.format(date));
		
		// �ڵ� ���̱�
		SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(pattern1.format(new Date()));
				

	}

}
