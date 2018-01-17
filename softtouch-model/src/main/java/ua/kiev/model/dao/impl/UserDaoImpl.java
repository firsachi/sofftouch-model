package ua.kiev.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.UserDao;
import ua.kiev.model.entities.User;

public class UserDaoImpl extends GenericMainDaoImpl<User> implements UserDao{

	@Transactional
	@Override
	public User byEmail(String emeil) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT u FROM User u WHERE u.username = :email";
		TypedQuery<User> query = session.createQuery(hql, User.class);
		query.setParameter("email", emeil);
		try {
			return query.getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
	}

	@Override
	public List<User> getAll() {
		String hql = "FROM User u";
		TypedQuery<User> tQuery = getSession().createQuery(hql, User.class);
		try {
			return tQuery.getResultList();
		}catch (NullPointerException ne) {
			return new ArrayList<User>();
		}
	}


}
