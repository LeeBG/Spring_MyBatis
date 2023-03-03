package com.itbank.iterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itbank.model.AccountDTO;

/*
 * interceptor : 요청을 가로채서 원하는 내용을 처리하는 클래스
 * 
 * 작동시점
 * 1. PreHandler		: 요청이 컨트롤러에 도달하기 전에
 * 2. PostHandler		: 컨트롤러의 메서드가 실행된 후 실행
 * 3. afterCompletion	: 클라이언트에 응답이 도달한 후 실행
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 세션은request로 부터 받을 수 있다.
		
		HttpSession session = request.getSession();
		AccountDTO user = (AccountDTO) session.getAttribute("user");
		String cpath = request.getContextPath();
		if(user == null) {
			response.sendRedirect(cpath+"/account/login");
			return false;		//false가 반환되면 컨트롤러를 이어서 수행하지 않음
		}
		
		return true;			// true가 실행되면 컨트롤러를 이어서 수행
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		System.out.println("컨트롤러 수행 완료");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("응답 완료");
		super.afterCompletion(request, response, handler, ex);
	}
	
}
