package ch_04_control;

public class For_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for �� -Ư�� Ƚ������ �۾��� �ݺ��ϰ� ���� �� ���
		//�ʱ�ȭ,���ǽ�,������,���� �κ����� ����
		/*for(�ʱ�ȭ; ���ǽ�; ������) {
			���ǽ��� ���� �� ����Ǵ� �κ�
		}
		*/
		//���� : �ʱ�ȭ ���� - ���ǽ� �˻� �� ���̸� ���� - ������ ���� - ���ǽ� �˻� �� ���̸� ���� - ������ ���� ... �ݺ�
		
		int sum = 0; //�� ���� ���� ����
		for (int i = 1; i <= 10; i++) {
			System.out.println( "i = " + i + ", sum = " + (sum += i));
		}

	}

}
