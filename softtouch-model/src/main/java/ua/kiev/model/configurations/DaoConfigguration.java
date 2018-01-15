package ua.kiev.model.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.kiev.model.dao.CompanyDao;
import ua.kiev.model.dao.RoleDao;
import ua.kiev.model.dao.SubdivisionDao;
import ua.kiev.model.dao.UserDao;
import ua.kiev.model.dao.impl.ComapnyDaoImpl;
import ua.kiev.model.dao.impl.RoleDaoImpl;
import ua.kiev.model.dao.impl.SubdivisionDaoImpl;
import ua.kiev.model.dao.impl.UserDaoImpl;
import ua.kiev.model.entities.Company;
import ua.kiev.model.entities.Role;
import ua.kiev.model.entities.Subdivision;
import ua.kiev.model.entities.User;

@Configuration
public class DaoConfigguration {
	
	@Bean
	public UserDao userDao(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.setType(User.class);
		return userDao;
	}
	
	@Bean
	public SubdivisionDao subdivisionDao() {
		SubdivisionDaoImpl subdivisionDao = new SubdivisionDaoImpl();
		subdivisionDao.setType(Subdivision.class);
		return subdivisionDao;
	}
	
	@Bean
	public CompanyDao comapnyDaoImpl() {
		ComapnyDaoImpl comapnyDaoImpl = new ComapnyDaoImpl();
		comapnyDaoImpl.setType(Company.class);
		return comapnyDaoImpl;
	}
	
	@Bean 
	public RoleDao roleDao() {
		RoleDaoImpl roleDao = new RoleDaoImpl();
		roleDao.setType(Role.class);
		return roleDao;
	}

}
