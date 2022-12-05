package ch_06_method;

public class CallByString_exam01 {
	// 문자열에 의한 호출 방식
	// 예외적으로 문자열을 전달하려면 참조형 데이터라도 값에 의한 호출을 함
	public void setAddress(String addr) {
		addr = "경기도 수원시 장안구";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "서울시 강남구 논현동";
				
		CallByString_exam01 st = new CallByString_exam01();
		System.out.println("메서드 호출 전");
		System.out.println("adress: " + address);	//address : 서울시 강남구 논현동
		
		st.setAddress(address);
		
		System.out.println("메서드 호출 후");
		System.out.println("adress: " + address); 	// adress : 서울시 강남구 논현동

	}

}
