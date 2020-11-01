package kr.co.jessiemarket.dao;

import org.springframework.stereotype.Repository;

import kr.co.jessiemarket.vo.MemberVo;
import kr.co.jessiemarket.vo.ResultVo;

@Repository
public interface MemberDao {

	public ResultVo selectCountUid(String uid);
	public MemberVo selectMember(MemberVo vo);
}
