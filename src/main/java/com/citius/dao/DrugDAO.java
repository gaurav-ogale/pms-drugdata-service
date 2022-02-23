package com.citius.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.exception.DrugException;
import com.citius.model.Drug;
import com.citius.repository.DrugRepo;

@Component
public class DrugDAO {
	
	@Autowired
	private DrugRepo drugRepo;
	
	public List<Drug> getDrugs() throws DrugException {
		// TODO Auto-generated method stub
		List<Drug> list = drugRepo.findAll();
		if(list.isEmpty())
			throw new DrugException("No drugs found");
		return dbToJson(list);
	}

	public List<Drug> getDrugByName(String drugName) throws DrugException {
		List<Drug> list = drugRepo.getDrugByName(drugName);

		if(list.isEmpty())
			throw new DrugException("No drug found for this drug name");
		else
			return dbToJson(list);
	}

	public List<Drug> getDrugsByKeyword(String keyword) throws DrugException{
		List<Drug> list = drugRepo.getDrugsByKeyword(keyword);

		if(list.isEmpty())
			throw new DrugException("No drug found for this keyword");
		else
			return dbToJson(list);
	}
	
	private List<Drug> dbToJson(List<Drug> drugList) {
		List<Drug> jsonList = new ArrayList<>();
		for (Drug d : drugList) {
			Drug drug = new Drug();
			drug.setDrugId(d.getDrugId());
			drug.setDrugName(d.getDrugName());
			drug.setActiveIngredient(d.getActiveIngredient());
			drug.setApplNo(d.getApplNo());
			drug.setForm(d.getForm());
			drug.setProductNo(d.getProductNo());
			drug.setReferenceDrug(d.getReferenceDrug());
			drug.setReferenceStandard(d.getReferenceStandard());
			drug.setStrength(d.getStrength());
			jsonList.add(drug);
		}
		return jsonList;
	}

	public List<String> getDrugNames() {
		return drugRepo.getDrugNames();
	}

	public List<Drug> getDrugByApplNo(int applNo) throws DrugException {
		List<Drug> list = drugRepo.getDrugByApplNo(applNo);
		if(list.isEmpty())
			throw new DrugException("No drugs found");
		return dbToJson(list);
	}

}
