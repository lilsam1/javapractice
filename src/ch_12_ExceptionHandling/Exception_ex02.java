package ch_12_ExceptionHandling;

/* 사용자 정의 예외 만들기 */
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

class MyScore {
	private int score;
	public void setScore(int s) throws MyException {
		if(s < 0) 
			throw new MyException("점수는 음수가 될 수 없습니다");
		else
			this.score = s;
	}
}

public class Exception_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyScore obj = new MyScore();
		try {
			obj.setScore(-10);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
