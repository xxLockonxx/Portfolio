package kr.co.jessiemarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jessiemarket.service.BoardService;
import kr.co.jessiemarket.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/board/notice")
	public String notice(String group, String cate, String pg, Model model) {
		return "/board/notice";
	}

	@GetMapping("/board/review")
	public String review() {
		return "/board/review";
	}
	
	
	@GetMapping("/board/write")
	public String write(String group, String cate, Model model) {
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		return "/board/write";
	}
	
	@GetMapping("/board/list")
	public String list(String group, String cate, String pg, Model model) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountBoard(cate);
		int pageEnd = service.getPageEnd(total);
		int count = service.getListCount(total, start);
		
		List<BoardVo> boards = service.selectBoards(start, cate);
		
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		model.addAttribute("boards", boards);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		model.addAttribute("count", count);
		
		return "/board/list";
	}
	
	@GetMapping("/board/view")
	public String view(String group, String cate, Model model) {
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		return "/board/view";
	}
	
	@GetMapping("/board/modify")
	public String modify(String group, String cate, Model model) {
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		return "/board/modify";
	}
	
	@GetMapping("/board/delete")
	public void delete(String group, String cate, Model model) {
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
	}
	
}
