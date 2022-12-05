package ch_07_class;

public class Class_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t;				// Tv 인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv();		// Tv 인스턴스 생성
		t.channel = 7;		// Tv 인스턴스의 멤버변수 channel의 값을 7로
		t.channelDown();	// Tv 인스턴스의 메서드 ChannelDown()을 호출
		System.out.println("현재 채널은 " + t.channel + "입니다");		// 현재 채널은 6 입니다

	}

}
