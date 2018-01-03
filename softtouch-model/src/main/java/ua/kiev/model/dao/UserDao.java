package ua.kiev.model.dao;

import java.util.List;

import ua.kiev.model.entities.User;

public interface UserDao extends GenericMainDao<User>{
	
	public User byEmail(String emeil);
	
	public List<User> getAll();
}
