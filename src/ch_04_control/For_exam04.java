package ch_04_control;

public class For_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ��ø for������ ������ ���
		 * for���� �� �ٸ� for���� ������ �� �ִµ�, �̰��� ��ø for���̶�� ��
		 * �� ��� �ٱ��� for���� �� �� ����� ������ ��ø�� for���� ����� Ƚ����ŭ
		 * �ݺ��ؼ� ���ٰ� �ٽ� �ٱ��� for���� ���ư�
		 */
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("***" + dan + "��***");
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + dan * times);
			}
			System.out.println();
		}

	}

}
