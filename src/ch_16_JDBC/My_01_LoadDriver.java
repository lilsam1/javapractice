package ch_16_JDBC;

/* JDBC�� �̿��ϴ� ���α׷� �ۼ� ����
1. ����ϰ��� �ϴ� RDBMS���� �����ϴ� JDBC ����̹� ��ġ
2. JDBC ����̹� �ε�
	����̹��� �ε��� ������ Ŭ������ ���� ���ε��� �����ϴ� Class Ŭ������ static �޼����� forName() �޼��� ���
3. DBMS�� ������ ����
	java.sql ��Ű���� �����ϴ� Connection ��ü�� ���
4. SQL�� ����
	select ������ ������ ������ java.sql ��Ű���� �����ϴ� statement ��ü�� ResultSet ��ü�� ���
	Statement ��ü�� SQL ������ ���� ���̰� ResultSe�� select ������ ������ ����� �ٷ�� ���� ��ü
*/

public class My_01_LoadDriver {
	// ����̹� Ŭ���� �ε�
	public static void loadDriver() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");	// org.mariadb.jdbc.Driver Ŭ������ �޸𸮿� �ε�
			System.out.println("Driver Load Success");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadDriver();

	}

}
