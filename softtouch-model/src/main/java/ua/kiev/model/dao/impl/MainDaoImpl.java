package ua.kiev.model.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import ua.kiev.model.dao.MainDao;

public class MainDaoImpl<T, E extends Serializable> implements MainDao<T, Serializable>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> type;

	public MainDaoImpl(Class<T> type) {
		this.type = type;
	}

	@Override
	public void create(T newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T read(Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(type, id);
	}

	@Override
	public void update(T transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T persistentObject) {
		// TODO Auto-generated method stub
		
	}



}
