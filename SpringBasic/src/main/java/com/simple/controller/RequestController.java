package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.QuizVO;
import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request") // 공통 경로 설정
public class RequestController {

    // 화면을 띄우는..
    @RequestMapping("/req_ex01") // == "/request/req_ex01"
    public String ex01() {
        return "request/req_ex01"; // 뷰 이름 반환
    }
    
    // 아래처럼 써도 된다
//    public void ex01() {
//    }

    // get 요청만 허용
    //@RequestMapping(value = "/basic1", method = RequestMethod.GET)
    @GetMapping("/basic1")
    public void basic1() {
        System.out.println("basic1번 get 요청");
    }

    // post 요청만 허용
    
    //@RequestMapping(value = "/basic2", method = RequestMethod.POST)
    @PostMapping("/basic2")
    public void basic2 () {
    	System.out.println("basic2 post 요청");
    }
    
    // get, post 둘다 허용
    @RequestMapping("/basic3")
    public void basic3 () {
    	System.out.println("basic3 get, post 요청");
    }
    
    /////// 파라미터 값 받기 - req_ex02.jsp /////////////
    
    @RequestMapping("/req_ex02")
    public String ex02() {
    	return "request/req_ex02";
    }
    
    // 고전 방법 1
//    @RequestMapping("/param1")
//    public String param1(HttpServletRequest request) {
//    	 String name = request.getParameter("name");
//    	 String age = request.getParameter("age");
//    	 String inter = request.getParameter("inter");
//    	 System.out.println(name);
//     	return "request/result"; // result페이지로 이동
//    }
    
    // 방법 2 - @RequestParam(네임값) - 반드시 필수로 값이 전달이 되야 한다
    // String name은 암거나 해도 상관 무
    
    // required = false => 반드시 필수가 아님
    // defaultValue => 값이 없을 떄 기본값
    // @RequestParam(value = "age", required = false, defaultValue = "0") int age,
    // @RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter)
    
//    @RequestMapping("/param1")
//    public String param1(@RequestParam("name") String name, 
//    					@RequestParam(value = "age", required = false, defaultValue = "0") int age,
//    					@RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter) { 
//    	
//    	System.out.println(name);
//    	System.out.println(age);
//    	
//    	System.out.println(inter.toString());
//    	
//     	return "request/result"; // result페이지로 이동
//    }
    
    // 커맨트객체를 이용하는 방법
    @RequestMapping("/param1")
    public String param1(ReqVO vo) { 
    	
    	System.out.println(vo.toString());
    	
     	return "request/result"; // result페이지로 이동
    }
    
    // 화면 처리 먼저!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @RequestMapping("/req_quiz01")
    public void quiz() {}
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(QuizVO vo) {

    	if (vo.getId().equals("abc123") || vo.getPw().equals("xxx123")) {
    		return "request/req_quiz01_ok";
    	} else {
    		return "request/req_quiz01_no";
    	}
    }
    
}
