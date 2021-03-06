package ua.kiev.model.dao;

import java.util.List;

import ua.kiev.model.entities.Company;

public interface CompanyDao extends GenericMainDao<Company>{
	
	List<Company> getResultList(boolean disable);
	Company byName(String name);

}
