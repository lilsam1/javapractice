package ch_07_class;

public class Getter_Setter {
	// getter, setter ����
	private String name;
	private int age;
	private short grade;
	private double avg;
	private int[] numArr;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public short getGrade() {
		return grade;
	}
	public void setGrade(short grade) {
		this.grade = grade;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int[] getNumArr() {
		return numArr;
	}
	public void setNumArr(int[] numArr) {
		this.numArr = numArr;
	}

	
	/*
	 setter : Ŭ���� �ܺο��� ���� �޾Ƽ� ��� ������ ����
	 return type�� void
	 �Ű� ������ ������ ��������� ���� type�̾�� ��
	 �̸� �տ� set�� ���̰� �ڿ��� ������ ��������� �̸�
	 
	 getter : Ŭ���� �ܺο� ��������� ���� ����(��ȯ)
	 return type�� ������ ��������� �ڷ����� ��ġ
	 �Ű� ������ �ʿ����
	 �̸� �տ� get�� ���̰� �ڿ��� ������ ��������� �̸�
	 
	 ���콺 ��Ŭ�� - source - generate getters and setters Ŭ���ؼ� ���ϴ� �׸�� üũ�ϸ� �ڵ� �ϼ�
	 ���� �ͼ������� ������ ���� �ϼ��غ���
	 */

}
