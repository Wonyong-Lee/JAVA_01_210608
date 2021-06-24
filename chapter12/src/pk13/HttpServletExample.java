package pk13;

public class HttpServletExample {

	public static void method(HttpServlet httpservlet) {     // 매개변수에 부모클래스 클래스명 + 변수명
		httpservlet.service();
	}
	
	public static void main(String[] args) {

		// HttpServletExample ht = new HttpServletExample();
		// 생략가능 : method에 매개변수로 객체가 설정되어 있음
		// 즉 : HttpServlet servlet = new FileDownloadServlet();
		
		method(new FileDownloadServlet());
		method(new LoginServlet());
		
		
	}

}
