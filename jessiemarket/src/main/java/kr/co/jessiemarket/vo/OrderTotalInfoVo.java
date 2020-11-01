package kr.co.jessiemarket.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderTotalInfoVo {

	int count;
	int price;
	int sale;
	int delivery;
	int point;
	int total;
	
	
	
}
