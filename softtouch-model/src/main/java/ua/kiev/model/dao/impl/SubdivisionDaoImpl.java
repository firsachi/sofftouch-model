package ua.kiev.model.dao.impl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.entities.Subdivision;

public class SubdivisionDaoImpl extends GenericMainDaoImpl<Subdivision> implements SubdivisionDao{
	
	@Transactional
	@Override
	public Set<Subdivision> getAll() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT s FROM Subdivision s";
		TypedQuery<Subdivision> tQuery = session.createQuery(hql, Subdivision.class);
		Set<Subdivision> result = new HashSet<Subdivision>(tQuery.getResultList());
		return result;
	}

}
