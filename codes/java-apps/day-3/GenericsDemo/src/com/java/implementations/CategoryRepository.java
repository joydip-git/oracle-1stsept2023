package com.java.implementations;

import java.util.List;

import com.java.contracts.Repository;
import com.java.entities.Category;

//implement Repository<T> where T is Category
public class CategoryRepository implements Repository<Category>{

	@Override
	public boolean addData(Category data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateData(int id, Category data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Category> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getData(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
