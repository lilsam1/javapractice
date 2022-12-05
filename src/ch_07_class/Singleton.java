package ch_07_class;

public class Singleton {

		/*
		 싱글톤 singleton
		 전체 프로그램에서 단 하나의 객체만 만들어 보장해야 하는 경우 사용
		 생성자를 호출한 만큼 객체가 생성되기 때문에
		 싱글턴을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야함
		 외부에서 생성자를 호출할 수 없도록 생성자 앞에 private 접근제한자를 붙여줌
		 
		 자신의 타입인 static 필드를 하나 선언하고 자신의 객체를 생생해 초기화 - static을 사용해서 객체가 생성됨
		 생성자가 private이지만 클래스 내부에서는 호출이 가능
		 static 필드도 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 막음
		 
		 대신 외부에서 호출할 수 있는 static 메서드인 getInstance()를 선언하고 static 필드에서 참조하고 있는 자신의 객체를 리턴
		 
		 ex) 사용예 : 게임에서 스코어는 하나의 데이터로 관리 - 싱글톤 필요
		 */
		
		private static Singleton singleton = new Singleton();
		
		private Singleton() {}
		
		static Singleton getInstatnce() {
			return singleton;
		}

}
