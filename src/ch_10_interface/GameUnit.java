package ch_10_interface;

/*
 ���� ���α׷����� �־��� ���� �������̽��� �̿��Ͽ�
 �ڽŸ��� ���� Ŭ���� (MyWeapon)�� �������϶�
 ��, ���� Ŭ�������� int curPower �ʵ尡 �ְ�,
 fire()�� curpower���� power��ŭ �����ϰ�
 charge()�� power��ŭ curPower�� ���� ��Ų��
 */

interface Weapon {
	public void fire(int power);	// �Ķ���� �Ŀ��� ���� �߻�
	public int getRestPower();		// ���� ���� �ִ� �Ŀ� ����
	public void charge(int power);	// �Ķ���͸�ŭ ���� �Ŀ� ����
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
 �־��� �ڵ带 �������� MyWeapon�� ����ϴ� GameUnit Ŭ������ �����ڿ� attack() �޼��带 �ϼ��϶�
 
 GameUnit �ν��Ͻ��� �� �� �����Ѵ�. 
 unitPower�� �� ���ֿ� ���޵Ǵ� �⺻ power�� ���⸦ ����� �� �����ȴ�.
 bossPower�� Ŭ���� ������ �����Ǵ� ��� GameUnit �ν��Ͻ��� �����Ѵ�
 �� ���ֿ����� �������� bossPower�� 0 ���ϰ� �Ǹ� ������ ������(System.exit(1))
 �����ڿ����� �Ķ���ͷ� �� ������ �̸��� �޾� �ʱ�ȭ�ϰ� ���� �ν��Ͻ��� ����� unitPower�� ���⸦ �����Ѵ�
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
	
	// attack() ����
	public void attack(int power) {
		GameUnit.bossPower -= power;
		System.out.println("���� bossPower : " + GameUnit.bossPower);
		if (GameUnit.bossPower < 0) {
			System.exit(1);
		}
	}

}
