package shopping_mall;

public class SmartTV extends Product {
	String resolution;	// �ػ�
	int inch;	// �߰�: ��ġ��
	
	public SmartTV(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	
	public SmartTV(String pname, int price, int pcode, String resolution, int inch) {
		this.pname = pname;
		this.price = price;
		this.pcode = pcode;
		this.resolution = resolution;
		this.inch = inch;
	}

	@Override
	public void printExtra() {
		// �߻� Ŭ������ ���ǵ� �߻� �޼��带 �������̵�
		// �߰� ������ �ػ� ������ ���
		System.out.println("�ػ�: " + resolution);
		System.out.println("��ġ��: " + inch);
	}

}
