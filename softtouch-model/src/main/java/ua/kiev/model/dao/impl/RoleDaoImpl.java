package ua.kiev.model.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.RoleDao;
import ua.kiev.model.entities.Role;
import ua.kiev.model.entities.RoleEnum;

public class RoleDaoImpl extends GenericMainDaoImpl<Role> implements RoleDao{
	
	@Override
	public Role byRole(RoleEnum roleEnum) {
		
		return null;
	}

	@Transactional
	@Override
	public List<Role> all() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT r FROM Role r";
		TypedQuery<Role> typedQuery = session.createQuery(hql, Role.class);
		return typedQuery.getResultList();
	}
	
	
}
