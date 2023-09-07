package com.java.contracts;

import java.util.List;

public interface RepositoryExtension<T> extends Repository<T> {
	List<T> searchByName(String name);
}
