package ch_09_abstract;

/*
 HttpsServlet 추상 클래스와 LoginServlet, FileDownloadServlet 클래스가 있습니다
 메인 클래스와 출력결과를 보고 LoginServlet, FileDownloadServlet 클래스를 완성하세요
 출력 결과)
 로그인 합니다
 파일 다운로드 합니다
 */
abstract class HttpsServlet {

	public abstract void service();
	
}

class LoginServlet extends HttpsServlet {
	public void service () {
		System.out.println("로그인합니다");
	}
}

class FileDownloadServlet extends HttpsServlet {
	public void service () {
		System.out.println("파일 다운로드합니다");
	}
}

public class Abstract_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServlet());	// 로그인합니다
		method(new FileDownloadServlet());	// 파일 다운로드합니다
	}
	
	public static void method(HttpsServlet servlet) {
		servlet.service();
	}

}
