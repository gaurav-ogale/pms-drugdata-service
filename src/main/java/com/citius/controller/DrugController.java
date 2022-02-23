package com.citius.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citius.model.Drug;
import com.citius.service.DrugService;

@RestController
public class DrugController {
	
	@Autowired
	private DrugService drugService;
	
	
	@GetMapping("/get/{drugName}")
	public ResponseEntity<List<Drug>> getDrugByName (@PathVariable String drugName){
		
		List<Drug> list = new ArrayList<>();
		try {
		System.out.println("Inside Controller");
		list= drugService.getDrugByName(drugName);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Drug>>(list, HttpStatus.OK);

	}
	
	@GetMapping("/getDrugs")
	public ResponseEntity<List<Drug>> getDrugs() {
	
		List<Drug> list = new ArrayList<>();
		try {
		System.out.println("Inside Controller");
		list= drugService.getDrugs();
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Drug>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getDrugByKeyword/{keyword}")
	public ResponseEntity<List<Drug>> getDrugBykeyword(@PathVariable String keyword) {
	
		List<Drug> list = new ArrayList<>();
		try {
		System.out.println("Inside Controller");
		list= drugService.getDrugByKeyword(keyword.toUpperCase());
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Drug>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getDrugNames")
	public ResponseEntity<List<String>> getDrugNames(){
		
		List<String> list = new ArrayList<>();
		try {
		list= drugService.getDrugNames();
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
		
	}
	
	@GetMapping("/getDrugByApplNo/{applNo}")
	public ResponseEntity<List<Drug>> getDrugByApplNo(@PathVariable int applNo) {
	
		List<Drug> list = new ArrayList<>();
		try {
		System.out.println("Inside Controller");
		list= drugService.getDrugByApplNo(applNo);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Drug>>(list, HttpStatus.OK);
	}
	
	


}
