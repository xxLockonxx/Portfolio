package kr.co.jessiemarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.CategoriesVo;
import kr.co.jessiemarket.vo.Category1Vo;
import kr.co.jessiemarket.vo.ProductsVo;

@Repository
public interface MainDao {

	public List<CategoriesVo> selectCategories();
	public List<ProductsVo> selectHitProduct();
	public List<ProductsVo> selectBestProduct();
	public List<ProductsVo> selectRecProduct();
	public List<ProductsVo> selectNewProduct();
	public List<ProductsVo> selectDiscountProduct();
	
	
}
