package kr.co.jessiemarket.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriesVo {

	private int code1;
	private String title;
	
	private List<Category2Vo> cate2List;
}
