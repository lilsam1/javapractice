package ch_09_abstract;

/*
 HttpsServlet �߻� Ŭ������ LoginServlet, FileDownloadServlet Ŭ������ �ֽ��ϴ�
 ���� Ŭ������ ��°���� ���� LoginServlet, FileDownloadServlet Ŭ������ �ϼ��ϼ���
 ��� ���)
 �α��� �մϴ�
 ���� �ٿ�ε� �մϴ�
 */
abstract class HttpsServlet {

	public abstract void service();
	
}

class LoginServlet extends HttpsServlet {
	public void service () {
		System.out.println("�α����մϴ�");
	}
}

class FileDownloadServlet extends HttpsServlet {
	public void service () {
		System.out.println("���� �ٿ�ε��մϴ�");
	}
}

public class Abstract_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServlet());	// �α����մϴ�
		method(new FileDownloadServlet());	// ���� �ٿ�ε��մϴ�
	}
	
	public static void method(HttpsServlet servlet) {
		servlet.service();
	}

}
