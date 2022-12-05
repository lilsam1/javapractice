package ch_08_inheritance_ex_product;

public class Tv extends Product{
	Tv() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다
		super(100);		// Tv의  가격을 100만원으로 한다
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
	

}
