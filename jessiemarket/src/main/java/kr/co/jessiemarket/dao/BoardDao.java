package kr.co.jessiemarket.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.JsonObject;

import kr.co.jessiemarket.vo.BoardVo;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertBoard() {}
	public void selectBoard() {}
	
	public List<BoardVo> selectBoards(int start, String cate) {
		
		Map<String, Object> values = new HashMap<>();
		values.put("start", start);
		values.put("cate", cate);
		
		return mybatis.selectList("mapper.board.SELECT_BOARDS", values);
	}
	
	public int selectCountBoard(String cate) {
		return mybatis.selectOne("mapper.board.SELECT_COUNT_BOARD", cate);
	}
	
	public void updateBoard() {}
	public void deleteBoard() {}
	
	
	
	public List<BoardVo> selectLatest(String cate) {
		return mybatis.selectList("mapper.board.SELECT_LATEST", cate);
	}
	
	
}
