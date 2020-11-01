package kr.co.jessiemarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.ProductsCartVo;
import kr.co.jessiemarket.vo.ProductsOrderVo;
import kr.co.jessiemarket.vo.TermsVo;

@Repository
public interface ProductsCartRepo extends JpaRepository<ProductsCartVo, Integer> {

}
