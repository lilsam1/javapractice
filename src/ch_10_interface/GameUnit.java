package ch_10_interface;

/*
 게임 프로그램에서 주어진 무기 인터페이스를 이용하여
 자신만의 무기 클래스 (MyWeapon)를 디자인하라
 단, 무기 클래스에는 int curPower 필드가 있고,
 fire()는 curpower에서 power만큼 차감하고
 charge()는 power만큼 curPower를 증가 시킨다
 */

interface Weapon {
	public void fire(int power);	// 파라미터 파워로 무기 발사
	public int getRestPower();		// 현재 남아 있는 파워 리턴
	public void charge(int power);	// 파라미터만큼 무기 파워 충전
}

class MyWeapon implements Weapon {
	private int curPower = 0;
	@Override
	public void fire(int power) {
		curPower -= power;
	}

	@Override
	public int getRestPower() {
		return curPower;
	}

	@Override
	public void charge(int power) {
		curPower += power;
	}
	
}

/*
 주어진 코드를 바탕으로 MyWeapon을 사용하는 GameUnit 클래스의 생성자와 attack() 메서드를 완성하라
 
 GameUnit 인스턴스는 두 개 생성한다. 
 unitPower는 각 유닛에 공급되는 기본 power로 무기를 사용할 때 차감된다.
 bossPower는 클래스 변수로 생성되는 모든 GameUnit 인스턴스에 공유한다
 두 유닛에서의 공격으로 bossPower가 0 이하가 되면 게임이 끝난다(System.exit(1))
 생성자에서는 파라미터로 각 유닛의 이름을 받아 초기화하고 무기 인스턴스를 만들어 unitPower로 무기를 충전한다
 */

public class GameUnit {
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		while(true) {
			unit1.attack(500);
			unit2.attack(50);
		}
	}
	
	GameUnit(String name) {
		this.name=name;
		this.weapon= new MyWeapon();
		this.weapon.charge(unitPower);
	}
	
	// attack() 구현
	public void attack(int power) {
		GameUnit.bossPower -= power;
		System.out.println("현재 bossPower : " + GameUnit.bossPower);
		if (GameUnit.bossPower < 0) {
			System.exit(1);
		}
	}

}
