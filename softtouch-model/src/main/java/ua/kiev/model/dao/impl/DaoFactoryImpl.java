package ua.kiev.model.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.UserDao;

public class DaoFactoryImpl extends DaoFactory{

	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public UserDao createUserDaoImpl() {
		return userDaoImpl;
	}
}
