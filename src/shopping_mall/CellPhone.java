package shopping_mall;

// Product 추상 클래스를 상속받아 구현한 CellPhone 클래스
public class CellPhone extends Product{
	String carrier;	// 통신사
	String maker;	//	추가 : 제조사
	
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
		System.out.println("통신사: " + carrier);
		System.out.println("제조사: " + maker);
	}
}
