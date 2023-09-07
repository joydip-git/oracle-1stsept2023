package com.java.implementations;

import java.util.List;

import com.java.contracts.RepositoryExtension;
import com.java.entities.Product;

//implement Repository<T> where T is Product
public class ProductRepository implements RepositoryExtension<Product> {

	@Override
	public boolean addData(Product data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateData(int id, Product data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
