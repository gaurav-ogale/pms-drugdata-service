package com.citius.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.citius.model.Drug;

@Repository
public interface DrugRepo extends JpaRepository<Drug,String> {
	
	@Query(value= "select * from drugdata p where p.drugname =?1",nativeQuery =true)
	public List<Drug> getDrugByName(String pcode);
	
	@Query(value= "select * from drugdata p where p.drugname like %?1% ", nativeQuery =true)
	public List<Drug> getDrugsByKeyword(String keyword);
	
	@Query(value = "select distinct drugname from drugdata", nativeQuery = true)
	public List<String> getDrugNames();

	@Query(value = "select * from drugdata d where d.applno=?1",nativeQuery = true)
	public List<Drug> getDrugByApplNo(int applNo);
	
	
	

}
