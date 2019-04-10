package com.mhoveidafar.visa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhoveidafar.visa.entity.BirthCountry;


@Repository

public interface IBirthCountryDAO extends CrudRepository<BirthCountry, Integer>{

}
