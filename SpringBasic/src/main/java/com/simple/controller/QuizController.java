package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz_02_VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public void quiz01() {}
	
	@RequestMapping("/quiz01_ok")
	public String quiz01_ok (@ModelAttribute("xxx") Quiz_02_VO vo) {
		System.out.println(vo.toString());
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
    public String quiz02() {
		return "quiz/quiz02";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute("zzz") Quiz_02_VO vo, Model model) {
	    model.addAttribute("msg", "회원가입이 완료되었습니다.");
	    model.addAttribute("zzz", vo);
	    System.out.println(vo.toString());
	    return "quiz/quiz02_ok";
	}
	
//	@RequestMapping(value = "/join", method = RequestMethod.POST)
//	public String join(@ModelAttribute("zzz") Quiz_02_VO vo, RedirectAttributes ra) {
//	    ra.addFlashAttribute("msg", "회원가입이 완료되었습니다.");
//	    ra.addFlashAttribute("zzz", vo);
//	    System.out.println(vo.toString());
//	    return "redirect:/quiz/quiz02_ok";
//	}

	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}

	@RequestMapping(value = "/join2", method = RequestMethod.POST)
	public String join2(@ModelAttribute("yyy") Quiz_02_VO vo, RedirectAttributes ra) {
	    if (vo.getId() == null || vo.getId().isEmpty()) {
	        ra.addFlashAttribute("idmsg", "아이디를 입력하세요.");
	        return "redirect:/quiz/quiz03";
	    } else if (vo.getPw() == null || vo.getPw().isEmpty() || !vo.getPw().equals(vo.getPwCheck())) {
	        ra.addFlashAttribute("pwmsg", "비밀번호를 확인하세요.");
	        return "redirect:/quiz/quiz03";
	    } else {
	        ra.addFlashAttribute("msg", vo.getId() + "님 회원가입을 축하드립니다.");
	        return "redirect:/quiz/quiz03_ok";
	    }
	}



	@RequestMapping("/quiz03_ok")
	public String quiz03_ok() {
		return "quiz/quiz03_ok";
	}
	
}
