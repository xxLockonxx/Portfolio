package kr.co.jessiemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubController {
	
	@GetMapping("/sub/aboutus")
	public String aboutus() {
		return "/sub/aboutus";
	}
	

}
