package ch_13_java.lang;

// ���ʸ�(Generic) : �Ϲ�ȭ, ����ȭ��� �ǹ�
// ���ʸ��� C++�� ���ø��� ������ ����
// C++���� �޸� ���ʸ� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������ ��쿡 ���� �� ��ȯ ����� �Ǽ� ���ʸ��� ��ȣ
// ���ʸ��� Ŭ������ �޼��忡�� ����ϴ� �ʵ峪 �Ű������� �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �����ϵ��� �ϴ� ���

class CommonData<T>{	// �Ϲ����� ������δ� Ŭ�������� �̸� ������ Ÿ���� �����ؾ� ������ ���ʸ��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ���� ���� 
	private T data;	// ������ Ÿ������ T�� ����. Type�� ����. Ŭ���� ���𿡼� <> ���̿� �ٸ� ���ڸ� �־ ��
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class Generic_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonData<String> stringCommonData = new CommonData<String>();	// ȣ���ϴ� �ʿ��� Ÿ���� ����
		CommonData<Integer> integerCommonData = new CommonData<>();		// �����ϸ鼭 Ÿ���� �����ϸ� �����ڿ����� Ÿ���� ���� ����
		stringCommonData.setData("abc");	// Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData());	// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());	// integerCommonData : 100

	}

}
