package shopping_mall;

// ���θ��� �����ϱ� ���� ��ó ���α׷�, IShop �������̽��� �����ϴ� �ٸ� ���θ�
public class ShopLauncher {
	
	// ���α׷� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
