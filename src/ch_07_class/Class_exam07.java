package ch_07_class;

public class Class_exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 참조 변수의 복사
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다");	// ch_07_class.Tv@1c4af82c
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다");	// ch_07_class.Tv@379619aa
		System.out.println();
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다");		// 0
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다");		// 0
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다");		// 7
		System.out.println("t2의 channel값은 " + t2.channel + "입니다");		// 0
		System.out.println();
		
		t1 = t2;	// t1이 저장한 주소값을 t2에 저장. 참조 변수라서 동일한 주소를 가리킴
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다");	// ch_07_class.Tv@379619aa
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다");	// ch_07_class.Tv@379619aa
		System.out.println();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다");		// 0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다");		// 0
		System.out.println();
		
		t1.channel = 27;
		System.out.println("t1의 channel값을 27로 변경하였습니다");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다");		// 27
		System.out.println("t2의 channel값은 " + t2.channel + "입니다");		// 27
		
	}

}
