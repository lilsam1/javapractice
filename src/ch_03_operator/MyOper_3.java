package ch_03_operator;

public class MyOper_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����������
		
		int i = 5;
		int j = 0;
		j = i++;	// 1.j = i; 	2.i = i + 1;
		System.out.println("j = i++; ���� ��, i=" + i +", j="+ j); //
		
		//����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		i = 5;
		j = 0;
		j = ++i;	// 1.i = i + 1; 	2.j = i;
		System.out.println("j = ++i; ���� ��, i=" + i +", j="+ j); //

	}

}
