package com.mhoveidafar.visa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhoveidafar.visa.entity.BirthCountry;

@Service
public interface IBirthCountryService {
	
	List<BirthCountry> findAllBirthCountry();

	BirthCountry save(BirthCountry country);

	BirthCountry update(BirthCountry country);

}
