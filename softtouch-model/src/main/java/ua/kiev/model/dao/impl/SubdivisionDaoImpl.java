package ua.kiev.model.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.entities.Subdivision;

public class SubdivisionDaoImpl extends GenericMainDaoImpl<Subdivision> implements SubdivisionDao{
	
	@Transactional
	@Override
	public List<Subdivision> getAll() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT s FROM Subdivision s";
		TypedQuery<Subdivision> tQuery = session.createQuery(hql, Subdivision.class);
		return tQuery.getResultList();
	}

}
