package ch_05_array;

public class Array_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ִ밪, ���ʰ� ���ϱ�
		
		int[]score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];	//�迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ
		int min = score[0];	//�迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}	//end of for
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

}