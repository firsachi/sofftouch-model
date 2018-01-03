package ua.kiev.model.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.RolesDao;
import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.dao.UserDao;

public class DaoFactoryImpl extends DaoFactory{

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Autowired
	private RolesDao roleDaoImpl;
	
	@Autowired
	private SubdivisionDao subdivisionDaoImpl;
	
	@Override
	public UserDao createUserDaoImpl() {
		return userDao;
	}

	@Override
	public RolesDao createRolesDaoImpl() {
		return roleDaoImpl;
	}

	@Override
	public SubdivisionDao createSubdivisionDao() {
		return subdivisionDaoImpl;
	}
}
