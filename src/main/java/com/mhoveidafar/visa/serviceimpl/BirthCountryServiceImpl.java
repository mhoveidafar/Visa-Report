package com.mhoveidafar.visa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhoveidafar.visa.entity.BirthCountry;
import com.mhoveidafar.visa.repository.IBirthCountryDAO;
import com.mhoveidafar.visa.service.IBirthCountryService;


@Service
public class BirthCountryServiceImpl implements IBirthCountryService {

	@Autowired
	IBirthCountryDAO birthCountryDao;
	
	@Override
	public List<BirthCountry> findAllBirthCountry() {
		
		return (List<BirthCountry>) birthCountryDao.findAll();
	}

	@Override
	public BirthCountry save(BirthCountry country) {

		return birthCountryDao.save(country);
	}

	@Override
	public BirthCountry update(BirthCountry country) {
		return birthCountryDao.save(country);
	}
	
	

}
