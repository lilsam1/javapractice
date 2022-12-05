package ch_08_inheritance;

class Employee {
	public int baseSalary = 3000000; // �⺻��
	int getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return baseSalary = 5000000;
//		return super.getSalary();
	}
	
}

class Programer extends Employee {
	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return baseSalary = 40000000;
//		return super.getSalary();
	}
	
}


/*
 �Ϲ� ������ Employee Ŭ������ �𵨸�
 Employee Ŭ������ ��ӹ޾� �����ڸ� ��Ÿ���� Manager Ŭ������
 ���α׷��Ӹ� ��Ÿ���� Programer Ŭ������ �ۼ��Ѵ�
 Employee Ŭ���� �ȿ��� ������ ����ϴ� getSalary() �޼��尡 �ִ�
 �� �޼��带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���޺��� �ٸ� ������ ��ȯ�ϵ��� �Ѵ�
 �������̵��� �� ���� Employee Ŭ������ baseSalary�� ����Ѵ�
 */

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("�������� ���� : " + manager.getSalary());
		// �������� ���� : 5000000
		
		Programer programer = new Programer();
		System.out.println("���α׷����� ���� : " + programer.getSalary());

	}

}
