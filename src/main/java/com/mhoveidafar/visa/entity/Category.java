package com.mhoveidafar.visa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")

public class Category {

	@Id
	private Integer fieldID;

	private String birthCountry;

	private Integer immediateRelativesOfCitizens;

	private Integer familySponsored;

	private Integer employmentBased;

	private Integer diversity;

	private Integer refugeesAndAsylees;

	private Integer other;

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

	public Integer getImmediateRelativesOfCitizens() {
		return immediateRelativesOfCitizens;
	}

	public void setImmediateRelativesOfCitizens(Integer immediateRelativesOfCitizens) {
		this.immediateRelativesOfCitizens = immediateRelativesOfCitizens;
	}

	public Integer getFamilySponsored() {
		return familySponsored;
	}

	public void setFamilySponsored(Integer familySponsored) {
		this.familySponsored = familySponsored;
	}

	public Integer getEmploymenBased() {
		return employmentBased;
	}

	public void setEmploymenBased(Integer employmenBased) {
		this.employmentBased = employmenBased;
	}

	public Integer getDiversity() {
		return diversity;
	}

	public void setDiversity(Integer diversity) {
		this.diversity = diversity;
	}

	public Integer getRefugeesAndAsylees() {
		return refugeesAndAsylees;
	}

	public void setRefugeesAndAsylees(Integer refugeesAndAsylees) {
		this.refugeesAndAsylees = refugeesAndAsylees;
	}

	public Integer getOther() {
		return other;
	}

	public void setOther(Integer other) {
		this.other = other;
	}

	public Category() {
		super();
	}
}
