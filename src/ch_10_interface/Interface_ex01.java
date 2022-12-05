package ch_10_interface;

/* 
  �����ؾ� �� ��ɵ��� �̸� �����ϰ� ��ȯ Ÿ���� ���� ���� ��Ӱ� ���� ���� �������̽�
  �ϳ��� ������Ʈ�� ������ �� ���ΰ� �� �ٸ� Ŭ���� �۾��� �ϴ��� �������̽��� �̸� ���س����� ������ �۾��� �����ʹ� �����ϰ� ������ ����
  
  KoreaTour, JapanTour, TourGuide Ŭ������ 3���̼� ���� �۾��ϰ� ���ÿ� ����
  �� �� �۾� ������ - 1) �������̽� 2) Ŭ���� �۾�
 */

interface Providable {	// �������̽�
	void leisureSports();	// public abstract ����
	void sightseeing();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}	
}

class TourGuide {
	private Providable tour;	// �������̽��� Ÿ�� ����
	TourGuide (Providable providable) {
		tour = providable;
	}
	// �������̵� �ƴ�
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}

public class Interface_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide = new TourGuide(new KoreaTour());
		
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}

}
