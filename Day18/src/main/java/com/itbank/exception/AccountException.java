package com.itbank.exception;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
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
