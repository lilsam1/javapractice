package shopping_mall;

public class SmartTV extends Product {
	String resolution;	// 해상도
	int inch;	// 추가: 인치수
	
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
		// 추상 클래스에 정의된 추상 메서드를 오버라이딩
		// 추가 정보인 해상도 정보를 출력
		System.out.println("해상도: " + resolution);
		System.out.println("인치수: " + inch);
	}

}
