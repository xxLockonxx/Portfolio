package kr.co.jessiemarket.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jessiemarket.vo.MemberVo;
import kr.co.jessiemarket.vo.ProductsCartVo;

@Controller
public class AdminMainController {

	@GetMapping(value={"/admin", "/admin/index"})
	public String index(HttpSession sess) {
		
		MemberVo member = (MemberVo) sess.getAttribute("member");
		
		if(member != null) {
			if(member.getType() == 2) {
				return "/admin/index";
			}else {
				return "redirect:/index";
			}
		}
		return "redirect:/index";
	}
	
}
