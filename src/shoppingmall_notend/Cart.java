package shoppingmall_notend;

public class Cart {
	int prductID, cnt;
	Cart(int prductID, int cnt) {
		this.prductID = prductID;	// 상품 코드
		this.cnt = cnt;	// 구매 개수
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "상품번호: " + prductID + ", 갯수: " + cnt;
	}
	
	

}
