package ch_07_class;

public class Singleton {

		/*
		 �̱��� singleton
		 ��ü ���α׷����� �� �ϳ��� ��ü�� ����� �����ؾ� �ϴ� ��� ���
		 �����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ������
		 �̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ���
		 �ܺο��� �����ڸ� ȣ���� �� ������ ������ �տ� private ���������ڸ� �ٿ���
		 
		 �ڽ��� Ÿ���� static �ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ - static�� ����ؼ� ��ü�� ������
		 �����ڰ� private������ Ŭ���� ���ο����� ȣ���� ����
		 static �ʵ嵵 private ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪�� �������� ���ϵ��� ����
		 
		 ��� �ܺο��� ȣ���� �� �ִ� static �޼����� getInstance()�� �����ϰ� static �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����
		 
		 ex) ��뿹 : ���ӿ��� ���ھ�� �ϳ��� �����ͷ� ���� - �̱��� �ʿ�
		 */
		
		private static Singleton singleton = new Singleton();
		
		private Singleton() {}
		
		static Singleton getInstatnce() {
			return singleton;
		}

}
