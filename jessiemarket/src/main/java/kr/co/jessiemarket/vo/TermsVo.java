package kr.co.jessiemarket.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jessie_terms")
public class TermsVo {

	@Id
	private int seq;
	private String terms;
	private String privacy;
	private String location;
	private String finance;
	private String tax;
}
