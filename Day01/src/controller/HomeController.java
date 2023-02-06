package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 7093021346907994761L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String test = "MVC 패턴 2 테스트 입니다~~";
		
		request.setAttribute("test", test);
		// - request는 forward시 유지된다!!!
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/ex02.jsp");
		rd.forward(request, response);
	}
	
	
}
