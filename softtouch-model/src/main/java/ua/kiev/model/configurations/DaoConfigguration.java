package ua.kiev.model.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.UserDao;
import ua.kiev.model.dao.impl.DaoFactoryImpl;
import ua.kiev.model.dao.impl.UserDaoImpl;
import ua.kiev.model.entities.User;

@Configuration
public class DaoConfigguration {
	
	@Bean
	public DaoFactory daoFactory() {
		return new DaoFactoryImpl();
	}
	
	@Bean(name = "userDao")
	public UserDao userDao(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.setType(User.class);
		return userDao;
	}

}
