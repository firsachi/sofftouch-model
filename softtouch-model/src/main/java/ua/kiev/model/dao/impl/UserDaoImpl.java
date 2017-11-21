package ua.kiev.model.dao.impl;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.UserDao;
import ua.kiev.model.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(User user) {

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public User byUser(String email) {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT u FROM User u WHERE u.username = :email";
		TypedQuery<User> tq = session.createQuery(query, User.class);
		tq.setParameter("email", email);
		return tq.getSingleResult();
	}

}
