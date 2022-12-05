package ch_08_inheritance_ex_product;

import java.util.ArrayList;

public class Buyer {	// ��, ������ ��� ���
	int money = 1000;	// ���� �ݾ�
	int bonusPoint = 0;	// ���ʽ� ����
	
	
	// ������ ��ǰ�� �����ϴ� ��� �߰�
	ArrayList item = new ArrayList();
//	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;							// Product �迭�� ���� ī����
	
	void buy(Product p) {	// �θ� Ŭ���� Ÿ������ �Ű����� ����
		// �θ� Ŭ������ �ʵ� ���. price, bonusPoint
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		
		money -= p.price;				// ���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint;		// ��ǰ�� ���ʽ� ����Ʈ�� �߰��Ѵ�
//		item[i++] = p;					// ��ǰ�� Product[] item�� �߰�
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");
	}
	
	void summary() {		// ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�
		int sum = 0;		// ������ ��ǰ�� �����հ�
		String itemList = "";		// ������ ��ǰ���
		
		/*ArrayList Ȱ���� ���*/
		if(item.isEmpty()) {	// Vector�� ����ִ��� Ȯ�� - ��������� true
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;
		}
		// Vector�� 1��°�� �ִ� ��ü�� ��� �´�
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		/* for�� �迭 Ȱ���� ���
		for(int i=0; i < item.length; i++ ) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		*/
		
		/* foreach�� Ȱ���� ���
		for (Product p : item) {
			if (p == null) {
				break;
			}
			sum += p.price;
			itemList += p + ", ";
		}
		*/

		/* �����ϰ�
		for (int i = 0; i < this.i; i++) {
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		*/
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
	}

}
