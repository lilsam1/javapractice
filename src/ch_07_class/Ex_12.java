package ch_07_class;

public class Ex_12 {
	/*
	 ShopService ��ü�� �̱������� ������Ѵ�
	 ShopService�� getInstance() �޼���� �̱����� ���� �� �ֵ��� ShopService Ŭ������ �ۼ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�");
		} else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�");
		}

	}

}
