package ch_10_interface;

interface DataAccessObject {
	public void insert();
	public void select();
	public void update();
	public void delete();
}

class OracleData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");	
	}
	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");	
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");	
	}
	
}

class MySqlData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");	
	}
	@Override
	public void update() {
		System.out.println("MySql DB�� ����");	
	}
	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
	
}

public class interface_ex08 {
	/*
	 DataAccessObject �������̽��� �� �������̽��� �����ϴ� OracleData, MySqlData Ŭ������ �ִ�
	 ���� Ŭ������ ���� ��� ����� ������ ���� �� �������̽��� Ŭ������ ���� �ϼ��ϼ���
	 */
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleData());
		dbWork(new MySqlData());
		// Oracle DB�� ����
		// Oracle DB���� �˻�
		// Oracle DB�� ����
		// Oracle DB���� ����
		// MySql DB�� ����
		// MySql DB���� �˻�
		// MySql DB�� ����
		// MySql DB���� ����

	}

}
