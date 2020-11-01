package kr.co.jessiemarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.ProductsCartVo;
import kr.co.jessiemarket.vo.ProductsVo;

@Repository
public interface ShopDao {

	public List<ProductsVo> selectProducts(int cate1, int cate2, int sort);
	
	public ProductsVo selectProduct(int code);
	
	public int insertCart(ProductsCartVo vo);
	
	public List<ProductsCartVo> selectCart(String uid);
	
	public int deleteCart(int[] seqs);
	
	public List<ProductsCartVo> selectOrder(int[] seqs);
	
}
