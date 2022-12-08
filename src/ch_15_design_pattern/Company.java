package ch_15_design_pattern;

public class Company {
	// 1. �����ڸ� private���� ����
	// �������� ���������ڰ� private�̹Ƿ� �ܺ� Ŭ�������� ������� Company �ν��Ͻ��� ���� �� �� ����
	// �� Company Ŭ���� ���ο����� �� Ŭ������ ������ ������ �� ����
	private Company() {}
	
	// 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� ����
	// private���� �����Ͽ� �ܺο��� �� �ν��Ͻ��� �������� ���ϵ��� �����ؾ� �ν��Ͻ� ������ ������ �� ����
	private static Company instance = new Company();	// �����ϰ� ������ �ν��Ͻ�
	
	// 3. �ܺο��� ������ �� �ִ� public �޼��� �����
	// �ν��Ͻ��� ��ȯ�ϴ� �޼���� �ݵ�� static���� �����ؾ� ��
	// getInstance() �޼���� �ν��Ͻ� ������ ������� ȣ���� �� �־�� �ϱ� ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// �����ϰ� ������ �ν��Ͻ� ��ȯ
	}
	

}
