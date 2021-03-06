package ua.kiev.model.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.CompanyDao;
import ua.kiev.model.entities.Company;

public class ComapnyDaoImpl extends GenericMainDaoImpl<Company> implements CompanyDao{

	@Override
	@Transactional
	public List<Company> getResultList(boolean disable) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Company c WHERE c.disable = :disable ORDER BY c.comapanyName";
		TypedQuery<Company> tQuery = session.createQuery(hql, Company.class);
		tQuery.setParameter("disable", disable);
		return tQuery.getResultList();
	}

	@Override
	public Company byName(String name) {
		String hql = "FROM Company c WHERE c.comapanyName = :name";
		TypedQuery<Company> tQuery = getSession().createQuery(hql, Company.class);
		tQuery.setParameter("name", name);
		try {
			return tQuery.getSingleResult();
		}catch (NoResultException e) {
			return null;
		}
	}

}
