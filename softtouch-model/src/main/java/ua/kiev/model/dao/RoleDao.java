package ua.kiev.model.dao;

import java.util.List;

import ua.kiev.model.entities.Role;
import ua.kiev.model.entities.RoleEnum;

public interface RoleDao extends GenericMainDao<Role>{
	
	Role byRole(RoleEnum roleEnum);
	
	List<Role> all();

}
