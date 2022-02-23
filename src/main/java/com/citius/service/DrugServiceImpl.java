package com.citius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.dao.DrugDAO;
import com.citius.exception.DrugException;
import com.citius.model.Drug;

@Service
public class DrugServiceImpl implements DrugService{
	
	@Autowired
	private DrugDAO drugDAO;

	@Override
	public List<Drug> getDrugs() throws DrugException {
		List<Drug> list = new ArrayList<>();
		try {
			list = drugDAO.getDrugs();
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new DrugException(e.getMessage());
		}
		return list;
	}

	@Override
	public List<Drug> getDrugByKeyword(String keyword) throws DrugException {
		
		List<Drug> list = new ArrayList<>();
		try {
			list = drugDAO.getDrugsByKeyword(keyword);
			System.out.println("service" + list.isEmpty());
		}
		catch(Exception ex) {
			throw new DrugException(ex.getMessage());
		}
		return (list);
	}
	
	@Override
	public List<Drug> getDrugByName(String drugName) throws DrugException {
		// TODO Auto-generated method stub
		List<Drug> list = new ArrayList<>();
		try {
			list = drugDAO.getDrugByName(drugName);
			System.out.println("service" + list.isEmpty());
		}
		catch(Exception ex) {
			throw new DrugException(ex.getMessage());
		}
		return (list);
	}

	@Override
	public List<String> getDrugNames() throws DrugException {
		return drugDAO.getDrugNames();
	}

	@Override
	public List<Drug> getDrugByApplNo(int applNo) throws DrugException {
		List<Drug> list = new ArrayList<>();
		try {
			list = drugDAO.getDrugByApplNo(applNo);
		}
		catch(Exception ex) {
			throw new DrugException(ex.getMessage());
		}
		return (list);
	}
	
	
	
	

}
