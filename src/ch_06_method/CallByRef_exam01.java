package ch_06_method;

public class CallByRef_exam01 {
	/*������ ���� ȣ�� ���
	�Ű������� Ÿ���� ������ Ÿ���� �� ���
	������ ���� ȣ���� �޼��� ȣ�� �� ���� �������� ��ġ�� �Ű������� ����
	
	���� ���� ȣ���� �޸𸮿� ������ ���� ���� �� ���������
	������ ���� ȣ���� �޸��� �ּҸ� �ֱ� ������  ���� �������� ����
	*/
	
	/* ���� ����, �� ����
	deep copy
	������ ��ü�� ����
	����� �� ��ü�� ������ �������� �޸�
	 */
	
	/* ���� ����, ���� ����
	shallo copy
	�ּҰ��� �����ϴ� ���
	 */
	public void increase(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] refArray = {100, 800, 1000};
		
		CallByRef_exam01 ref = new CallByRef_exam01();
		
		System.out.println("�޼��� ȣ�� ��");
		for(int i = 0; i < refArray.length; i++) {
			System.out.println("refArray[" + i +"]: " + refArray[i]);
		}
		
		


	}

}
