package ch_04_control;

public class Switch_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch��
		 ���ǽ��� �ش��ϴ� ���̽��� �̵� �� ����
		 */
		
		
		// �ϳ� ���� ���� å ���� ���� ��Ʈ�� ���
		int book = 15;
		book = book / 10;
		switch(book) {
		case 0:	//10�� �̸�	//case�� ��. ��� ��� X 
			System.out.println("���� �� ����ϼ���");
			break;	
			//break ������ ������ ��� ����
		case 1: //10�̻� 20�� �̸�
			System.out.println("å �д� ���� ���� ���̽ó׿�");
			break;
		case 2: //20�̻� 30�� �̸�
			System.out.println("å�� ����ϴ� ���̽ó׿�");
			break;
		default: //30�� �̻�
			System.out.println("����� �ٵ����Դϴ�");
		}

	}

}
