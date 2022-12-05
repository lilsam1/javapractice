package ch_12_ExceptionHandling;

class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}

public class Exception_ex01 {
	public static void ticketing(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeException e) {
			e.printStackTrace();
		}

	}

}
