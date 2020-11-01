package kr.co.jessiemarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.MemberVo;

@Repository
public interface MemberRepo extends JpaRepository<MemberVo, String>{

}
