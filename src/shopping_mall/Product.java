package shopping_mall;

// ���θ� ��ǰ ���Ǹ� ���� �߻� Ŭ����
// �پ��� ��ǰ ������ �����ϱ� ���� �⺻ ���� �� ��¸� �߻�Ŭ�������� �����ϰ�
// �߰� ������ ���� Ŭ�������� �����ϵ��� ������
public abstract class Product {
	String pname;	// ��ǰ��
	int price;		// ����
	int pcode;	// �߰�: ��ǰ�ڵ�
	
	// ��ǰ��� ������ ����ϴ� �⺻���� ��� �޼��� + ��ǰ�ڵ� �߰�
	// ��ǰ�� �⺻ ������ ��ǰ �̸��� ������ ��� + ��ǰ�ڵ� �߰�
	// �� ������ ����Ϸ��� printExtra() �޼��带 ȣ��
	public void printDetail() {
		System.out.println("��ǰ��: " + pname + " , ");
		System.out.println("����: " + price + " , ");
		System.out.println("��ǰ�ڵ�: " + pcode + " , ");
		printExtra();
	}
	
	// �߻� �޼���. ���� ������ ���� Ŭ�������� ��
	// printDetail()���� �ڵ����� ȣ���ϹǷ�, printDetail()���� ������ ���뵵 �ڵ����� �Բ� ���
	public abstract void printExtra();
}
