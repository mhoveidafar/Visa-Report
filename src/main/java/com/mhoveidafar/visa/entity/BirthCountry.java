package com.mhoveidafar.visa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRnationality")

public class BirthCountry {
	
	@Id   // Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fieldID;
	
	private String birthCountry;
	
	private Integer year2015;
	
	private Integer year2016;
	
	private Integer year2017;

	public Integer getFieldID() {
		return fieldID;
	}

	public void setFieldID(Integer fieldID) {
		this.fieldID = fieldID;
	}

	public String getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}

	public Integer getYear2015() {
		return year2015;
	}

	public void setYear2015(Integer year2015) {
		this.year2015 = year2015;
	}

	public Integer getYear2016() {
		return year2016;
	}

	public void setYear2016(Integer year2016) {
		this.year2016 = year2016;
	}

	public Integer getYear2017() {
		return year2017;
	}

	public void setYear2017(Integer year2017) {
		this.year2017 = year2017;
	}

	public BirthCountry() {
		super();
	}	
}
