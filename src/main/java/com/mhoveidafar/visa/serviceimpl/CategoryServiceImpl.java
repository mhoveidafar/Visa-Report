package com.mhoveidafar.visa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhoveidafar.visa.entity.Category;
import com.mhoveidafar.visa.repository.ICategoryDAO;
import com.mhoveidafar.visa.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryDAO categoryDao;
	
	@Override
	public List<Category> findAllCategory() {
		
		return (List<Category>) categoryDao.findAll();
	}

}
