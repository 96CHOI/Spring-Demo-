package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controller는 페이지 주소를 작성할 때 사용하는 어노테이션
@Controller
public class PageController {

	@GetMapping("/")
	public String callIndexPage() {
		// return에 html파일 이름을 작성
		return "index";
	}

	// 사용자(클라이언트)가 /home 주소를 입력하면
	// home이름을 가진 html을 return 한다는 걸 의미.
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {

		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);

		return "home";
	}

	@GetMapping("/96choi")
	public String callHomePage1() {
		return "choi";
	}

	@GetMapping("/movie")
	public String callMoviePage(HttpServletRequest request) {

		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);

		return "movie";
	}

	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}

	@GetMapping("/login2")
	public String callLogin2Page() {
		return "login2";
	}

	@GetMapping("/emp")
	public String callempPage(HttpServletRequest request) {

		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);

		return "emp";
	}

	@GetMapping("/dept")
	public String calldeptPage(HttpServletRequest request) {

		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);

		return "dept";
	}
}
