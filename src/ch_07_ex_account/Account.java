package ch_07_ex_account;

public class Account {
	// ���� ������ �����ϱ� ���� Ŭ����
	// �ʵ�, ������, getter / setter �θ� ����
	private String ano;		// ���¹�ȣ
	private String owner;	// ������
	private int balance;	// �ܾ�
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}