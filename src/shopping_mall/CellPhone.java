package shopping_mall;

// Product �߻� Ŭ������ ��ӹ޾� ������ CellPhone Ŭ����
public class CellPhone extends Product{
	String carrier;	// ��Ż�
	String maker;	//	�߰� : ������
	
	public CellPhone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	
	public CellPhone(String pname, int price, int pcode, String carrier, String maker) {
		this.pname = pname;
		this.price = price;
		this.pcode = pcode;
		this.carrier = carrier;
		this.maker = maker;
	}

	@Override
	public void printExtra() {
		System.out.println("��Ż�: " + carrier);
		System.out.println("������: " + maker);
	}
}
