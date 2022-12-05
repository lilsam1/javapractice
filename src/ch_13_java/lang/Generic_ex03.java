package ch_13_java.lang;

// 제너릭(Generic) : 일반화, 범용화라는 의미
// 제너릭은 C++의 템플릿이 발전한 형태
// C++과는 달리 제너릭 대신 Object를 사용하면 모든 데이터 타입을 사용할 수 있지만 경우에 따라 형 변환 해줘야 되서 제너릭을 선호
// 제너릭은 클래스나 메서드에서 사용하는 필드나 매개변수의 자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능

class CommonData<T>{	// 일반적인 방식으로는 클래스에서 미리 데이터 타입을 지정해야 하지만 제너릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정 
	private T data;	// 데이터 타입으로 T를 지정. Type의 약자. 클래스 선언에서 <> 사이에 다른 문자를 넣어도 됨
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class Generic_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonData<String> stringCommonData = new CommonData<String>();	// 호출하는 쪽에서 타입을 지정
		CommonData<Integer> integerCommonData = new CommonData<>();		// 선언하면서 타입을 지정하면 생성자에서는 타입을 생략 가능
		stringCommonData.setData("abc");	// 클래스의 데이터 타입이 Object라서 모든 데이터 타입이 사용 가능
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData());	// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());	// integerCommonData : 100

	}

}
