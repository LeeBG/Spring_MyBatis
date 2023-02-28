package com.itbank.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;
import com.itbank.service.AccountService;

@RequestMapping("/account")
@Controller
public class AccountController {

	@Autowired
	private AccountService as;

	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("/account/list");
		mav.addObject("list", as.selectAll());
		return mav;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/account/loginForm");

		return mav;
	}

	@PostMapping("/login")
	public String login(HttpSession session, AccountDTO user) throws NullPointerException, UnsupportedEncodingException, NoSuchAlgorithmException  {
		session.setAttribute("user", as.login(user));

		return "redirect:/";
	}


	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		session.removeAttribute("user");
		mav.addObject("msg", "로그아웃 되었습니다.");
		mav.setViewName("account/success");
		return mav;
	}

	@GetMapping("/mypage")
	public void mypage() {
	}

	@PostMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx, AccountDTO user,HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		ModelAndView mav = new ModelAndView();
		String msg = "정보수정 실패";
		String site = "account/fail";

		int row = as.update(user);

		if (row != 0) {
			session.removeAttribute("user");
			msg = "정보수정 성공. 다시 로그인 해 주세요";
			site = "account/success";
		}

		mav.addObject("msg", msg);
		mav.setViewName(site);

		return mav;
	}

	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		String msg = "회원탈퇴 실패";
		String site = "account/fail";

		int row = as.delete(idx);

		if (row != 0) {
			// 회원탈퇴했는데 세션에 정보가 남아있음
			session.removeAttribute("user");
			msg = "회원탈퇴 성공";
			site = "account/success";
		}

		mav.addObject("msg", msg);
		mav.setViewName(site);

		return mav;
	}

	@GetMapping("/join")
	public ModelAndView join(String agree) {
		ModelAndView mav = new ModelAndView("account/joinForm");

		if (agree == null) {		// 약관 동의 체크가 없으면 
			agree = as.getAgree();	// 약관 동의 내용과

			mav.addObject("agree", agree);
			mav.setViewName("account/join");	// viewName을 변경
		}

		return mav;
	}

	// 컨트롤러에서 전가된 예외는 @ControllerAdvice 스프링빈이 받는다.
	@PostMapping("/join")
	public ModelAndView join(AccountDTO user) throws Exception {
		ModelAndView mav = new ModelAndView();

		as.join(user);

		mav.addObject("msg", "가입성공");
		mav.setViewName("account/success");

		return mav;
	}
	
	@GetMapping("/forgotId")
	public void forgetId() {
		
	}
	@GetMapping("/forgotPw")
	public void forgetPw() {
		
	}

	@PostMapping("/forgotId")
	public ModelAndView forgetId(AccountDTO user){
		ModelAndView mav = new ModelAndView();
		String userid = as.forgotId(user);
		userid = "일치하는 계정은" + userid + "입니다";
		
		mav.addObject("msg", userid);
		mav.setViewName("account/success");
		
		return mav;
	}
	
	@PostMapping("/forgotPw")
	public ModelAndView forgotPw(AccountDTO user) throws Exception {
		ModelAndView mav = new ModelAndView();
		String newPw = as.getNewPw(user);
		newPw = "재발급된 임시 패스워드는 ["+newPw+"] 입니다.";
		
		
		mav.addObject("msg",newPw);
		mav.setViewName("account/success");
		
		
		return mav;
	}
}
