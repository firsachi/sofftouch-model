package ua.kiev.model.dao;

import java.util.Set;

import ua.kiev.model.entities.Role;
import ua.kiev.model.entities.RoleEnum;

public interface RolesDao {
	
	Role byRole(RoleEnum roleEnum);
	Set<Role> all();

}
