package ch_10_interface;

/* 
  구현해야 할 기능들을 미리 협의하고 반환 타입을 정해 놓는 약속과 같은 것이 인터페이스
  하나의 프로젝트를 진행할 떄 서로가 다 다른 클래스 작업을 하더라도 인터페이스를 미리 정해놓으면 서로의 작업의 정도와는 무관하게 진행이 가능
  
  KoreaTour, JapanTour, TourGuide 클래스를 3명이서 각각 작업하고 동시에 개발
  이 때 작업 순서는 - 1) 인터페이스 2) 클래스 작업
 */

interface Providable {	// 인터페이스
	void leisureSports();	// public abstract 생략
	void sightseeing();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}	
}

class TourGuide {
	private Providable tour;	// 인터페이스로 타입 선언
	TourGuide (Providable providable) {
		tour = providable;
	}
	// 오버라이딩 아님
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
