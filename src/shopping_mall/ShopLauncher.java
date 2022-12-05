package shopping_mall;

// 쇼핑몰을 실행하기 위한 런처 프로그램, IShop 인터페이스를 구현하는 다른 쇼핑몰
public class ShopLauncher {
	
	// 프로그램 메인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
