package ua.kiev.model.dao;

import java.io.Serializable;

public interface MainDao<T, E extends Serializable> {
	
	void create(T newInstance);
	T read(E id);
	void update(T transientObject);
	void delete(T persistentObject);
}
