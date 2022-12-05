package ch_07_class;

class MyMath1 {
	int add (int a, int b) {
		return a + b;
	}
	long add (long a, int b) {
		return a + b;
	}
	long add (int a, long b) {
		return a + b;
	}
	long add (long a, long b) {
		return a + b;
	}
	int add (int[] a) {
		int result = 0;
		for(int i=0; i < a.length; i++) {
			result += a[i];
			
		}
		return result;
	}
}

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath1 mm = new MyMath1();
		System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
		// mm.add(3, 3) 결과: 6
		
		System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
		// mm.add(3L, 3) 결과: 6
		
		System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
		// mm.add(3, 3L) 결과: 6
		
		
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));
		// mm.add(3L, 3L) 결과: 6

		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));

	}

}
