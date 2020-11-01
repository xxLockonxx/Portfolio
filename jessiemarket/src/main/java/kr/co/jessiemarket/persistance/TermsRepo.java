package kr.co.jessiemarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.TermsVo;

@Repository
public interface TermsRepo extends JpaRepository<TermsVo, Integer> {

}
