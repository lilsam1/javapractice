package ch_15_design_pattern;

class ServiceA {
	void runWork() {
		System.out.println("work");
	}
}

class ServiceB {
	void runStudy() {
		System.out.println("study");
	}
}

// ����͸� �����ϸ� ��ȯ�� converter��� �� �� ����
// ��ȯ���� ������ ���� �ٸ� �� �������̽� ���̿� ����� �����ϰ� �ϴ� ��

class AdapterServiceA {
	ServiceA serviceA = new ServiceA();
	void runService() {
		serviceA.runWork();
	}
}

class AdapterServiceB {
	ServiceB serviceB = new ServiceB();
	void runService() {
		serviceB.runStudy();
	}
}

public class Patton_adaptor_ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();
		
		serviceA.runWork();
		serviceB.runStudy();
		
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		// ������ �޼��� ���� ����� �� ����
		asa1.runService();
		asb1.runService();

	}

}
