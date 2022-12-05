package ch_07_class;

public class Singleton_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 생성자의 접근제한자가 private에서 실행이 안됨
		Singleton singleton1 = new Singleton();	// 컴파일 에러
		Singleton singleton2 = new Singleton();	// 컴파일 에러
		*/
		Singleton singleton1 = Singleton.getInstatnce();
		Singleton singleton2 = Singleton.getInstatnce();
		
		if(singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체입니다");
		}
		else {
			System.out.println("다른 Singleton 객체입니다");
		}

	}

}
