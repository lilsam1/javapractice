package ch_10_interface;

class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("����Ÿ�� �������� ����");
	}

	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}

	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}
}

public class Interface_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();	// ����Ÿ�� �������� ����
		guide2.sightseeing();	// ����ī ���� ����
		guide2.food();			// �ʹ� ����

	}

}
