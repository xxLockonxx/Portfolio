package kr.co.jessiemarket.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="jessie_category1")
public class Category1Vo {

	@Id
	private int code1;
	private String title;
	
}
