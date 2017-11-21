package ua.kiev.model.dao;

import ua.kiev.model.entities.User;

public interface UserDao {
	
	void create(User user);
	void update(User user);
	User byUser(String  email);
	
}
