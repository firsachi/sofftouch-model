package ua.kiev.model.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.RolesDao;
import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.dao.UserDao;

public class DaoFactoryImpl extends DaoFactory{

	@Autowired
	private UserDao userDaoImpl;
	
	@Autowired
	private RolesDao roleDaoImpl;
	
	@Autowired
	private SubdivisionDao subdivisionDaoImpl;
	
	@Override
	public UserDao createUserDaoImpl() {
		return userDaoImpl;
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
