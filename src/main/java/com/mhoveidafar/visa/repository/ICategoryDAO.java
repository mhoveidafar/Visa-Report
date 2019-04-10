package com.mhoveidafar.visa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mhoveidafar.visa.entity.Category;

@Repository

public interface ICategoryDAO extends CrudRepository<Category, Integer> {

}
