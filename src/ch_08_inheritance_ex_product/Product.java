package ch_08_inheritance_ex_product;

public class Product {
	int price;							// ��ǰ�� ����
	int bonusPoint;						// ��ǰ���� �� �����ϴ� ���ʽ� ����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ���ʽ� ������ ��ǰ������ 10%
	}

}
