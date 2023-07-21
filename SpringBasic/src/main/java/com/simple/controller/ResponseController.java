package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.QuizVO;
import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	// res_ex01에 뿌릴거면 여기에..
	@RequestMapping("/res_ex01")
	public void ex01() {}
	
	// Model객체 = (ModelMap)
	// model전달자 이용하여 데이터를 가지고 나간다
	//model.addAttribute(키, 오브젝트 값(모든))
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("date", new Date());
		return "/response/ex02";
	}
	
	// ModelAndView - 데이터와 화면 정보를 동시에 저장하는 객체
	@RequestMapping("/ex03")
	public ModelAndView ex03() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("serverTime", new Date()); // 데이터
		mv.setViewName("response/ex03"); // 화면 정보
		
		return mv;
	}
	
	//@ModelAttribute 방식 : 화면에서 넘어오는 키값
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id) {
	
		System.out.println("넘어온 값 : " + id);
		
		return "response/ex04";
	}
	
	//@ModelAttribute 방식 : vo받아서 xxx이름으로 변경해서 화면으로 전달
	@RequestMapping("/ex05")
	// xxx명칭을 지어서 다음 화면으로 넘긴다
	public String ex05(@ModelAttribute("xxx") ReqVO vo) {
	
		System.out.println(vo.toString());
		return "response/ex05";
	}
	
	// 리디렉션과 리디렉션 어트리뷰트 - 조인 폼
	// 데이터 가지고 나갈 게 없을 때 사용
	// 화면 차리
	@RequestMapping("/join")
	public String join() {
		return "response/join";
	}
	
	@RequestMapping(value="/joinForm", method=RequestMethod.POST)
	// join form 요청
	public String joinForm(ReqVO vo, RedirectAttributes ra) {
		
		// 가입처리 했습니다~~~처리 후 홈 화면으로 이동
		// 리다이렉트 시 사용하며, 1회서 데이터를 화면에 전달해 줄 수 있다
		// 리다이렉트시 model은 사용할 수 없다
		ra.addFlashAttribute("msg", "정상 처리되었습니다");
		
		// MVC2방식에서는 다시 controller릁 태워서 보낸다 -> HomeController를 출력
		// redirect:/절대경로 주소
		return "redirect:/";
	}
	
	@RequestMapping("/res_quiz01")
	public String res_quiz01() {
		return "response/res_quiz01";
	}
	
	@RequestMapping("/res_login")
	public String res_login (@ModelAttribute("xxx")QuizVO vo, RedirectAttributes ra) {
		
		
		
		if(vo.getId().equals("kim12") && vo.getPw().equals("1234")) {
			
			return "response/res_quiz02";
		} else {
			
			ra.addFlashAttribute("msg", "아이디 비밀번호를 확인하세요");
			
			// 절대경로로 리다이렉트 보냄
			return "redirect:/response/res_quiz01";
		}
		
	}
	
}
