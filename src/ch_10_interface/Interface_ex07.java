package ch_10_interface;

interface Buy {
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}

interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}

class Customer implements Buy,Sell {
	@Override
	public void buy() {
		System.out.println("�����ϱ�");	
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");	
	}

	// ����Ʈ �޼��尡 �ߺ��� �Ǿ����� �� �������̽��� �����ϴ� Customer Ŭ�������� ������ �ؾ���
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
}

/* �� Ŭ������ ���� �������̽��� �����ϴ� ���
 ���� �� Ŭ������ ���� Ŭ������ ��ӹ����� �޼��� ȣ���� ��ȣ������ ������ �߻��� �� ����
 �׷��� �ڹٴ� ���� ����� �������� ����
 
 ������ �������̽��� �� Ŭ������ ���� �������̽��� ������ �� ����
 �������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ ���� ���� ���ÿ� ������ �� ����
 �� �������̽��� �̸��� ���� �߻� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�����Ƿ� � �޼��带 ȣ���ؾ� �ϴ��� ��ȣ���� ���� ��
 
 ���� �� �������̽��� ����Ʈ �޼��尡 �ߺ��Ǵ� ���,
 �� Ŭ������ ���� ������ �������̽��� ������ �޼��尡 �ִ� �����
 �������̵��� �ؾ� ��
 */

public class Interface_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ
		Buy buyer = customer;
		buyer.buy();
		buyer.order();	// �� �Ǹ� �ֹ�
//		buyer.sell();	// ���� �ȵ�
		
		// Customer ���������� cumstomer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ
		// seller�� Sell �������̽��� �޼��常 ȣ�� ����
		Sell seller = (Sell)customer;	//(Sell) ��������
		seller.sell();
		buyer.order();	// �� �Ǹ� �ֹ�
//		seller.buy();	// ���� �ȵ�
		
		if(seller instanceof Customer) {
			// seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();	// �� �Ǹ� �ֹ�
	}
}
