package ch_07_class;

class Account1{
	private int balance = 0;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		this.balance = (balance < MIN_BALANCE || balance > MAX_BALANCE) ? this.balance : balance ;
	}
	
	public int getBalance() {
		return balance;
	}
	

}

public class Ex_13 {
	/*
	 은행 계좌 객체인 Account 객체는 잔고 (balance) 필드를 가지고 있다
	 balance 필드는 음수값이 될 수 없고, 최대 백만원까지 저장할 수 있다
	 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고
	 0 ~ 1,000,000 범위의 값만 가질 수 수 있도록 Account 클래스를 작성하라
	 
	 1) Setter와 Getter를 이용한다
	 2) 0과 1,000,000은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용한다 ( 유지보수가 쉽도록 )
	 3) Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지한다
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 account = new Account1();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
	}

}
