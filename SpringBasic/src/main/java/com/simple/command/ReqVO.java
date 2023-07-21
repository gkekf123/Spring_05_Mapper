package com.simple.command;

import java.util.ArrayList;

public class ReqVO {

	// 만드는 규칙 - VO와 동일하게 만든다
	// 폼값의 name과 동일한 변수를 멤버변수로 선언
	
	private String name;
	private String age; // int는 클라이언트의 제어가 안되면 에러가 되기 떄문에 주의
	private ArrayList<String> inter; // checkbox
	
	// 기본 생성자 ctrl space enter
	private void name() {
		
	}	
	
	// 
	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}

	// 필수는 아니지만 값을 빠르게 확인 하기 위해서
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}

	// getter, setter - setter기준으로 이름을 만든다
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
	
	
}
