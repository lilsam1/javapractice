package ch_10_interface;

class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
}

public class Interface_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();	// 도쿄타워 번지점프 투어
		guide2.sightseeing();	// 오사카 관람 투어
		guide2.food();			// 초밥 투어

	}

}
