package kr.co.jessiemarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.jessiemarket.vo.Category1Vo;

public interface MainRepo extends JpaRepository<Category1Vo, Integer>{

}
