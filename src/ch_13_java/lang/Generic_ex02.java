package ch_13_java.lang;

import java.util.ArrayList;

/*
 Ÿ�� ����ġ�� ���� ĳ������ ����� �߸��� ĳ�������� ���� ������ �����ϱ� ����
 �ڹ�5���� ������ ������ ���ʸ�
 ���ʸ��� Ŭ������ �μ�ȭ�Ͽ� ������ Ÿ�Կ� ���� �����ϴ� �Ϲ����� �˰����� ����
 
 �����ҷ��� �ڷ����� ���ʸ����� ������ �ڷ����� �ƴϸ� ������ ������ ��
 ������ �߿� �Ǽ��� �̸� �� �� �ִٴ� ���� �߿��� �����̸� �ڵ��� ������ �� ���꼺 ��� ū �⿩
 
 ���ʸ��� ����
 1) ������ �� Ÿ���� üũ�� �� �ִ�
 2) ĳ������ �ʿ䰡 ���� ���Ǽ��� �������� ���ȴ�
 */

public class Generic_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		// ����Ʈ���� �������� ���� �����ϰ� �ٸ� �ڷ����� �����ϸ� �����Ͽ��� ����
		// arNum.add("���ڿ�");
		int value = arNum.get(0);
		System.out.println(value);

	}

}
