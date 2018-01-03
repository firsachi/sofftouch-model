package ua.kiev.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.kiev.model.configurations.ModelConfiguration;
import ua.kiev.model.dao.DaoFactory;
import ua.kiev.model.dao.UserDao;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ModelConfiguration.class);
		applicationContext.refresh();
		applicationContext.start();
		DaoFactory daoFactory = (DaoFactory) applicationContext.getBean(DaoFactory.class);
		UserDao userDao = daoFactory.createUserDaoImpl();
		System.out.println(userDao.byId(1).toString());
	}

}
