package kr.co.jessiemarket.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="jessie_category2")
public class Category2Vo {

	@Id
	private int seq;
	private int code1;
	private int code2;
	private String title;
	
}
