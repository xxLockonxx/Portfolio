package kr.co.jessiemarket.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jessiemarket.persistance.MemberRepo;
import kr.co.jessiemarket.service.MemberService;
import kr.co.jessiemarket.vo.MemberVo;
import kr.co.jessiemarket.vo.ResultVo;

@RestController
public class MemberRestController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/member/checkUid")
	public ResultVo checkUid(String uid) {
		return service.selectCountUid(uid);
	}
	
}
