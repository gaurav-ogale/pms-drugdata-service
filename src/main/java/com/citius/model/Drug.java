package com.citius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "drugdata")
public class Drug {
	
	@Id
	@Column(name = "drugid")
	private String drugId;
	
	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String id) {
		this.drugId = id;
	}

	@Column(name = "applno")
	private int applNo;
	
	@Column(name = "productno")
	private int productNo;
	
	@Column(name = "form")
	private String form;
	
	@Column(name = "strength")
	private String strength;
	
	@Column(name = "referencedrug")
	private int referenceDrug;
	
	@Column(name = "drugname")
	private String drugName;
	
	@Column(name = "activeingredient")
	private String activeIngredient;
	
	@Column(name = "referencestandard")
	private int referenceStandard;

	public int getApplNo() {
		return applNo;
	}

	public void setApplNo(int applNo) {
		this.applNo = applNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public int getReferenceDrug() {
		return referenceDrug;
	}

	public void setReferenceDrug(int referenceDrug) {
		this.referenceDrug = referenceDrug;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getActiveIngredient() {
		return activeIngredient;
	}

	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	public int getReferenceStandard() {
		return referenceStandard;
	}

	public void setReferenceStandard(int referenceStandard) {
		this.referenceStandard = referenceStandard;
	}
	
	

}
