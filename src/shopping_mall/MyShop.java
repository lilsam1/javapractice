package shopping_mall;

import java.util.ArrayList;
import java.util.Scanner;

// IShop �������̽��� ������ MyShop Ŭ����
public class MyShop implements IShop{
	// ��� ȸ�� ���� �迭
	User[] users = new User[2];
	
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	
	// ��ǰ �߰��� ���� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// Ű���� �Է����� ���ڿ� �Է¹ޱ� ���� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	// ���õ� ����� index ����
	int selUser;
	
	// ���θ� �̸�
	String title;

	@Override
	public void setTitle(String title) {	// ���θ� ����(�̸�) ����
		this.title = title;
	}
	
	/**
	 * ���α׷����� ����ϱ� ���� ���� ����� ��� �޼���
	 */
	@Override
	public void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("��ΰ�", PayType.CASH);
		users[1] = user;
//		
//		PayType[] payTypes = {PayType.CASH, PayType.CARD};
//		System.out.println("����� �̸��� �Է��ϼ���");
//		String userName = scan.next();
//		System.out.println("���� ������ �����ϼ��� -0.CASH -1.CARD");
//		int payTypeint = scan.nextInt();
//		System.out.println();
	}
	
	/**
	 * ���α׷����� ����ϱ� ���� ���� ��ǰ ��� �޼���
	 */
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("������ ��Ʈ5", 1000000, 1111, "SKT" , "�Ｚ");
		products[0] = cellPhone;
		cellPhone = new CellPhone("���� ������7", 980000, 3333, "KT" , "����");
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("�Ｚ 3D Smart TV", 5000000, 5555, "4K" , 30);
		products[2] = smartTV;
		smartTV = new SmartTV("LG Smart TV", 2500000, 7777, "Full HD" , 40);
		products[3] = smartTV;
	}
	
	/**
	 * ���α׷� ���� ���� �޼���
	 */
	@Override
	public void start() {
		System.out.println(title + " : ����ȭ�� - ���� ����");
		System.out.println("===============================");
		int i = 0;
		
		// ��ϵ� ����� ���� ���
		for(User user : users) {
			System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() +")");
		}

		
		System.out.println("[X] ��  ��");
		System.out.println("���� : ");
		String sel = scan.next();
		System.out.println("## "+sel+"���� ##");
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
			case "X" :
				System.exit(0);
				break;
			default:
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	
	/**
	 *  ��ǰ ����� ���� ��ǰ�� ������ ��ٱ��Ͽ� �ֱ� ���� �޼���
	 */
	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("==============================");
		int i = 0;
		
		// ��ϵ� ��ǰ ���� ���
		for(Product product : products) {
			System.out.print("[" + i + "]");
			product.printDetail();
			i++;
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.print("���� : ");
		String sel = scan.next();
		System.out.println("## "+sel+"���� ##");
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
			case "h":
				start();
				break;
			case "c" :
				checkOut();
				break;
			default:
				int psel = Integer.parseInt(sel);
				cart.add(products[psel]);
				productList();
		}
	}
	
	/**
	 * ���� ������ ���� üũ�ƿ� ó�� �޼���
	 */
	public void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("=========================");
		int total = 0;
		int i = 0;
		
		
		
		// ��ٱ��Ͽ� ��ϵ� ��ǰ ���� ���
		for(Product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total = total + p.price;
		}
		System.out.println("=========================");
		
		// ������ ������� ���� ��� ���
		System.out.println("���� ���: " + users[selUser].getPayType());
		
		// �հ� ���
		System.out.println("�հ�: " + total + "�� �Դϴ�");
		System.out.println("[p]���� , [q]���� �Ϸ�");
		System.out.println("����: ");
		String sel = scan.next();
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
			case "q" : System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ� ##");
				System.exit(0); break;
			case "p" : productList(); break;
			default: checkOut();
		}
	}

}
