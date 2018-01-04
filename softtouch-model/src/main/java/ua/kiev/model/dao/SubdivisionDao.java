package ua.kiev.model.dao;

import java.util.Set;

import ua.kiev.model.entities.Subdivision;

public interface SubdivisionDao extends GenericMainDao<Subdivision>{
	
	Set<SubdivisionDao> getAll();

}
