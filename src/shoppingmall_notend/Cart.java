package shoppingmall_notend;

public class Cart {
	int prductID, cnt;
	Cart(int prductID, int cnt) {
		this.prductID = prductID;	// ��ǰ �ڵ�
		this.cnt = cnt;	// ���� ����
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ǰ��ȣ: " + prductID + ", ����: " + cnt;
	}
	
	

}
