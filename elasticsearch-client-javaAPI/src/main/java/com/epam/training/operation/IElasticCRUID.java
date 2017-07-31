package com.epam.training.operation;

import java.util.Collection;

public interface IElasticCRUID<T> {
	void addToIndex(T object);
	void addToIndex(Collection<T> objects);
	
	void update(T object);
	void delete(int id);
	
	
	
	
}
