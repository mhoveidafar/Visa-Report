package com.mhoveidafar.visa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhoveidafar.visa.entity.BirthCountry;
import com.mhoveidafar.visa.entity.Category;
import com.mhoveidafar.visa.service.IBirthCountryService;
import com.mhoveidafar.visa.service.ICategoryService;

@RestController

public class VisaController {

	@Autowired
	private IBirthCountryService birthCountryService;
	
	@Autowired
	private ICategoryService categoryService;
	
	@GetMapping("/birth-country")
	public ResponseEntity<List<BirthCountry>> getBirthCountryList() {
		List<BirthCountry> list = birthCountryService.findAllBirthCountry();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/category")
	public ResponseEntity<List<Category>> getCategoryList() {
		List<Category> list = categoryService.findAllCategory();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}	
}
