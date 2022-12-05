package ch_10_interface;

interface Camera {
	void photo();
}

interface Call {
	void calling();
}

interface Memo {
	void write();
}

interface Clock {
	void coock();
}

class MyCellPhone implements Camera, Call, Memo, Clock {
	@Override
	public void coock() {
		// 시계 메서드
	}
	@Override
	public void write() {
		// 메모 메서드
	}
	@Override
	public void calling() {
		// 통화 메서드
		
	}
	@Override
	public void photo() {
		// 사진 메서드
	}
}

class PhoneUser {
	void call(Call c) {
		System.out.println("전화를 걸었습니다");
	}
}

public class Interface_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		
		PhoneUser user1 = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		user1.call((MyCellPhone)phone2);

	}

}
