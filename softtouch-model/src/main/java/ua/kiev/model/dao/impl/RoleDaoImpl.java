package ua.kiev.model.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.model.dao.RolesDao;
import ua.kiev.model.entities.Role;
import ua.kiev.model.entities.RoleEnum;

@Repository
@Transactional
public class RoleDaoImpl  implements RolesDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Role byRole(RoleEnum roleEnum) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Role.class, roleEnum);
	}

	public Set<Role> all() {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT r FROM Role r";
		TypedQuery<Role> tq = session.createQuery(query, Role.class);
		List<Role> list = tq.getResultList();
		if(list.size() == 0) {
			fill();
		}else {
			tq = session.createQuery(query, Role.class);
		}
		Set<Role> result = new HashSet<Role>(tq.getResultList());
		return result;
	}
	
	private void fill() {
		for(RoleEnum roleEnum: RoleEnum.values()) {
			add(new Role(roleEnum));
		}
	}
	
	@Transactional
	private void add(Role role) {
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
	}
	
}
