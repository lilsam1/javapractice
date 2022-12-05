package ch_08_inheritance_ex_product;

public class Computer extends Product {
	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
}

