package kr.co.jessiemarket.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jessiemarket.service.MainService;
import kr.co.jessiemarket.vo.CategoriesVo;
import kr.co.jessiemarket.vo.Category1Vo;
import kr.co.jessiemarket.vo.ProductsVo;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;

	@GetMapping(value={"/", "/index"})
	public String index(Model model, HttpSession sess) {
		
		List<CategoriesVo> cate1List = service.selectCategories();
		List<ProductsVo> hitList = service.selectHitProduct();
		
		sess.setAttribute("cate1List", cate1List);
		//System.out.println("길이1 : "+cateList.size());
		//System.out.println("길이2 : "+cateList.get(2).getCate2List().size());  
		
		model.addAttribute("hitList", hitList);
		
		return "/index";
	}
	
	@ResponseBody
	@GetMapping("/main/best")
	public List<ProductsVo> best() {
		return service.selectBestProduct();
	}
	
	@ResponseBody
	@GetMapping("/main/recommend")
	public List<ProductsVo> recommend() {
		return service.selectRecProduct();
	}
	
	@ResponseBody
	@GetMapping("/main/newItems")
	public List<ProductsVo> newItems() {
		return service.selectNewProduct();
	}
	
	@ResponseBody
	@GetMapping("/main/discountItems")
	public List<ProductsVo> discountItems() {
		return service.selectDiscountProduct();
	}

}
