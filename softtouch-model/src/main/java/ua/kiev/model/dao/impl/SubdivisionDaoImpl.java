package ua.kiev.model.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;
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
		String hql = "FROM Subdivision s WHERE s.delete = false ORDER BY s.name";
		TypedQuery<Subdivision> tQuery = session.createQuery(hql, Subdivision.class);
		return tQuery.getResultList();
	}

	@Override
	public Subdivision getName(String name) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM  Subdivision s WHERE s.name = :name";
		TypedQuery<Subdivision> tQuery = session.createQuery(hql, Subdivision.class);
		tQuery.setParameter("name", name);
		try {
			return tQuery.getSingleResult();
		}catch (NoResultException e) {
			return null;
		}
		
	}

}
