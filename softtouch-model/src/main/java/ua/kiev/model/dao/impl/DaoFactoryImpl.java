package ua.kiev.model.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;

import ua.kiev.model.dao.CompanyDao;
import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.RoleDao;
import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.dao.UserDao;

public class DaoFactoryImpl extends DaoFactory{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDaoImpl;
	
	@Autowired
	private SubdivisionDao subdivisionDaoImpl;
	
	@Autowired
	private CompanyDao companyDaoImpl;
	
	@Override
	public UserDao createUserDaoImpl() {
		return userDao;
	}

	@Override
	public RoleDao createRolesDaoImpl() {
		return roleDaoImpl;
	}

	@Override
	public SubdivisionDao createSubdivisionDao() {
		return subdivisionDaoImpl;
	}

	@Override
	public CompanyDao createCompanyDao() {
		return companyDaoImpl;
	}
}
