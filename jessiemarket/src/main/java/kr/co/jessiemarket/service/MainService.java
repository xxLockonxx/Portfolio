package kr.co.jessiemarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jessiemarket.dao.MainDao;
import kr.co.jessiemarket.vo.CategoriesVo;
import kr.co.jessiemarket.vo.Category1Vo;
import kr.co.jessiemarket.vo.ProductsVo;

@Service
public class MainService {

	@Autowired
	private MainDao dao;
	
	public List<CategoriesVo> selectCategories(){
		return dao.selectCategories();
	}
	public List<ProductsVo> selectHitProduct() {
		return dao.selectHitProduct();
	}
	public List<ProductsVo> selectBestProduct() {
		return dao.selectBestProduct();
	}
	public List<ProductsVo> selectRecProduct() {
		return dao.selectRecProduct();
	}
	public List<ProductsVo> selectNewProduct() {
		return dao.selectNewProduct();
	}
	public List<ProductsVo> selectDiscountProduct() {
		return dao.selectDiscountProduct();
	}
}
