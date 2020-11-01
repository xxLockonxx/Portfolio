package kr.co.jessiemarket.service;


import java.io.File;
import java.util.List;
import java.util.UUID;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.jessiemarket.dao.BoardDao;
import kr.co.jessiemarket.vo.BoardVo;
import kr.co.jessiemarket.vo.FileVo;


@Service
public class BoardService {

	@Autowired
	private BoardDao dao;
	
	
	public void insertBoard() {}
	public void selectBoard() {}
	
	public List<BoardVo> selectBoards(int start, String cate) {
		return dao.selectBoards(start, cate);
	}
	
	public void updateBoard() {}
	public void deleteBoard() {}
	
	public List<BoardVo> selectLatest(String cate) {
		return dao.selectLatest(cate);
	}
	
	// Limit start 계산
	public int getLimitStart(String pg) {
		if(pg == null) {
			return 0;
		}else {
			int page = Integer.parseInt(pg);
			return (page - 1) * 10;			
		}
	}
	// 전체 게시물 갯수
	public int selectCountBoard(String cate){
		return dao.selectCountBoard(cate);
	}
	// 페이지 번호 계산
	public int getPageEnd(int total) {
		
		int pageEnd = 0;
		
		if(total % 10 == 0) {
			pageEnd = total / 10;
		}else {
			pageEnd = (total / 10) + 1;
		}
		return pageEnd;
	}
	// list count 계산
	public int getListCount(int total, int start) {
		return (total - start) + 1;
	}
	// 파일 업로드
	public FileVo fileUpload(HttpServletRequest req, MultipartFile file, int seq) {
		
		String path = req.getSession().getServletContext().getRealPath("/resources/files/");
		
		if(!file.isEmpty()) {
			// 파일 첨부 했을때	
			String oName = file.getOriginalFilename();
			String ext = oName.substring(oName.lastIndexOf("."));
			
			// 고유파일명 생성
			String uName = UUID.randomUUID().toString()+ext;
			
			// 파일 저장
			try {
				file.transferTo(new File(path+uName));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			FileVo vo = new FileVo();
			vo.setParent(seq);
			vo.setOldName(oName);
			vo.setNewName(uName);
			
			return vo;
			
		}else {
			// 파일 첨부 안했을때
			return null;
		}	
	}
	// 파일 다운로드
	public void fileDownload() {
		
	}
}
