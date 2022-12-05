package ch_07_class;

class Cellphone {
	String mode1 = "Galaxy 8";
	String color;
	int capacity;
	
	/* 기본 생성자
	 모든 클래스에는 반드시 하나 이상의 생성자가 존재해야함
	 컴파일러가 자동으로 '기본 생성자'를 추가해줘서 몰랐던 것
	*/
	 
	
	/* 생성자의 특징 1) 클래스의 이름과 같다 2) 반환형이 없다 3) 인스턴스 생성시 자동으로 실행 (단 한번)
	   
	 생성자를 정의하지 않으면 void 생성자가 기본으로 제공
	 생성자를 정의하면 자바가 제공이 되는 void 생성자가 사라짐
	 void 생성자를 사용하려면 따로 정의를 내려줘야 함
	*/

	Cellphone(String color, int capacity) {	// 매개 변수가 있는 생성자
		this.color = color;	
		this.capacity = capacity;
	}
//	Cellphone() {	// 매개 변수가 없는 생성자
//	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cellphone myphone1 = new Cellphone();	// 에러 발생 - 매개 변수가 없는 생성자 작성시 에러x
		Cellphone myphone = new Cellphone("silver", 64);
		
		System.out.println(myphone.mode1);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		
		
	
	}

}
