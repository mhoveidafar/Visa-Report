package com.mhoveidafar.visa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mhoveidafar.visa.entity.BirthCountry;
import com.mhoveidafar.visa.entity.Category;
import com.mhoveidafar.visa.repository.IBirthCountryDAO;
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
	
	@PostMapping("/country")
	public ResponseEntity<Object> createCountry(@RequestBody BirthCountry country) {
		BirthCountry savedCountry = birthCountryService.save(country);
		return new ResponseEntity<>(savedCountry, HttpStatus.OK);
	}

	@Autowired
	private IBirthCountryDAO iBirthCountryDAO;
	
	@PutMapping("/country-updating/{fieldID}")
	public ResponseEntity<Object> updateCountry(@RequestBody BirthCountry country, @PathVariable Integer fieldID) {
		Optional<BirthCountry> countryOptional = iBirthCountryDAO.findById(fieldID);

		if (!countryOptional.isPresent())
			return ResponseEntity.notFound().build();

		country.setFieldID(fieldID);
		
		iBirthCountryDAO.save(country);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/country/{fieldID}")
	public void deleteCountry(@PathVariable Integer fieldID) {
		iBirthCountryDAO.deleteById(fieldID);
	}

	
	
	@GetMapping("/category")
	public ResponseEntity<List<Category>> getCategoryList() {
		List<Category> list = categoryService.findAllCategory();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}	
}
