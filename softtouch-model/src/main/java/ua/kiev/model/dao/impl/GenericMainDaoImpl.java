package ua.kiev.model.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.GenericMainDao;

public abstract class GenericMainDaoImpl<E> implements GenericMainDao<E>{

	@Autowired
	protected SessionFactory sessionFactory;
	
	private Class<E> type;
	
	public final void setType(Class<E> type) {
		this.type = type;
	}
	
	@Override
	public void create(E entity) {
		Session session = sessionFactory.getCurrentSession();
		session.save(entity);
	}
	
	@Override
	public void update(E entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}
	
	@Override
	public void delete(E entity) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(entity);
	}
	
	@Transactional
	@Override
	public E byId(int primaryKey) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(type, primaryKey);
	}	
}