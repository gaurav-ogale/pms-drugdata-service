package com.citius.service;

import java.util.List;

import com.citius.exception.DrugException;
import com.citius.model.Drug;

public interface DrugService {

	List<Drug> getDrugs() throws DrugException;

	List<Drug> getDrugByKeyword(String keyword) throws DrugException;

	List<Drug> getDrugByName(String drugName) throws DrugException;

	List<String> getDrugNames() throws DrugException;

	List<Drug> getDrugByApplNo(int applNo) throws DrugException;

}
