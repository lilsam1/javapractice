package ch_06_method;

public class method_exam12 {
	/* 메서드 내에서의 메서드 호출
	메서드에서 다른 메서드를 호출하면 메서드는 동작을 멈추고 다른 메서드가 종료할 때 까지 기다림
	호출한 메서드가 종료되면 나머지 코드가 실행이 됨
	main() => fisrtMethod() => secondMethod()
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("fisrstMethod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음");
		System.out.println("secondMethod()이 끝났음");
	}

}
