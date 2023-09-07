package com.java.contracts;

import java.util.List;

public interface Repository<T> {
	boolean addData(T data);

	boolean updateData(int id, T data);

	boolean deleteData(int id);

	List<T> getAllData();

	T getData(int id);
}
