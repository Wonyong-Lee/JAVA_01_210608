package pk13;

public class HttpServletExample {

	public static void method(HttpServlet httpservlet) {     // �Ű������� �θ�Ŭ���� Ŭ������ + ������
		httpservlet.service();
	}
	
	public static void main(String[] args) {

		// HttpServletExample ht = new HttpServletExample();
		// �������� : method�� �Ű������� ��ü�� �����Ǿ� ����
		// �� : HttpServlet servlet = new FileDownloadServlet();
		
		method(new FileDownloadServlet());
		method(new LoginServlet());
		
		
	}

}
