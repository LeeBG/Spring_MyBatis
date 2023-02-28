package com.itbank.exception;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
 * ※ 예외를 모아서 처리하는 이유
 * - 기본적으로 예외는 try ~ catch 로 처리할 수 있다.
 * - 단, try -catch 남용은 가독성을 저해한다.
 * - 따라서, try-catch 를 최소화 할 수 있게 예외를 전가하는 throws가 있다.
 */

@ControllerAdvice // 프로젝트에서 발생하는 예외를 모아서 처리할 클래스
public class AccountException {

	// 전가된 예외와 일치하면 아래 메서드가 수행된다.
	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView dke() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "가입 실패");
		mav.setViewName("account/fail");

		return mav;
	}

	@ExceptionHandler(NullPointerException.class)
	public ModelAndView npe(NullPointerException e) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "로그인 실패");
		mav.setViewName("account/fail");
		return mav;
	}
	
}
