package ch_02_var;

public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*�ڵ� ����ȯ�� ���α׷� �ۼ��ڰ� ������ �۾��� ���� �ʾƵ�
		  �ڹٰ� �˾Ƽ� �˸��� Ÿ������ ��ȯ
		  ���� �������� ū ������ ����Ǵ� ��� -> �� �ս��� ����	 
		 */
		
		byte a = 127; //byte�� ���� �� �ִ� �ִ�
		int b = a; //�ڵ� ����ȯ (byte -> int)
		System.out.println(b);
		//a = b; //float �ڷ����� byte ������ �����ϸ� �ڵ�����ȯ�� �ȵ�
		
		float c = b; //�ڵ� ����ȯ(int -> float)
		System.out.println(c);
		
		//int d = c; //float �ڷ����� int ������ �����ϸ� �ڵ�����ȯ�� �ȵ�

	}

}
