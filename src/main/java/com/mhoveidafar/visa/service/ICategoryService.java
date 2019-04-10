package com.mhoveidafar.visa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhoveidafar.visa.entity.Category;

@Service
public interface ICategoryService {

	List<Category> findAllCategory();

}
