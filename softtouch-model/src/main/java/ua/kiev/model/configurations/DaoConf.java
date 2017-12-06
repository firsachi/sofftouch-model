package ua.kiev.model.configurations;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.kiev.model.dao.MainDao;
import ua.kiev.model.dao.impl.MainDaoImpl;
import ua.kiev.model.entities.Subdivision;

@Configuration
public class DaoConf {

	@Bean
	public MainDao<Subdivision, Serializable> subdivisionDao(){
		MainDao<Subdivision, Serializable> subdivisionDao = new MainDaoImpl<Subdivision, Integer>(Subdivision.class);
		return subdivisionDao;
	}
}
