package ch_13_java.lang;

import java.util.HashMap;

/* Students Ŭ������ �ۼ��ϵ�, Object�� equlas()�� hashCode()�� �������ؼ�
  Students�� �й� studentNum �� ������ ���� ��ü�� �� �� �ֵ��� �غ�����
  Students Ŭ������ �ʵ�� ������ �����ϴ�.
  hashCode()�� ���� ���� studentNum �ʵ� ���� �ؽ��ڵ带 ���� �ϵ��� �ϼ���
 */

class Students {
	private String studentNum;
	
	public Students(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	// �ڵ� �ۼ�
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Students) {	// ������ Ŭ������ ��ü�̸�
			Students student = (Students)obj;	// Student Ŭ������ ����ȯ
			if(studentNum.equals(student.getStudentNum()))	// �� ��ü�� �й��� �Ű������� �Ѿ�� ��ü�� �й��� ������ true ��ȯ
				return true;
		}
		return false;
	}
	}
	
	


public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Students, String> hashMap = new HashMap<Students, String>();
		
		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Students("1"), "95");
		
		String score = hashMap.get(new Students("1"));
		System.out.println("1�� �л��� ���� : " + score);

	}

}
