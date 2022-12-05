package ch_07_class;

class Printer {
	static void println (String value) {
		System.out.println(value);
	}
	static void println (boolean value) {
		System.out.println(value);
	}
	static void println (int value) {
		System.out.println(value);
	}
	static void println (double value) {
		System.out.println(value);
	}
}

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");

	}

}
