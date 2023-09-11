package com.java.jdbc.jdbcapp.dal;

import java.util.Set;

public interface RepositoryAbstraction<T> {
	Integer add(T data) throws Exception;

	Integer update(int id, T data) throws Exception;

	Integer remove(int id) throws Exception;

	Set<T> getAllRecords() throws Exception;

	T getRecordById(int id) throws Exception;
}
