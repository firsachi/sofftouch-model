package ua.kiev.model.dao;

public interface GenericMainDao<E> {
	
	void create(E entity);
	
	void update(E entity);
	
	void delete(E entity);
	
	E byId(int primaryKey);

}
