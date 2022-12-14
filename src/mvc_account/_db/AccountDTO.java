package mvc_account._db;

/* DTO(Data Transfer Object), VO(Value Object)
 ������ ���� ���� �ʴ� ������ ������ ��ü�̸� �Ӽ��� �� �Ӽ��� �����ϱ� ���� getter, setter �޼��常 ���� Ŭ����
 */
public class AccountDTO {
	private int id;			// ����
	private String name;	// �̸�
	private long balance;	// �ܾ�
	
	public AccountDTO() {
		
	}

	public AccountDTO(int id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account{" +
				"id=" + id +
				", name='" + name + '\'' +
				", balance=" + balance + 
				"}"
		;
	}
	
	
	
	

}
