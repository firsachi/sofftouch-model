package ua.kiev.model.dao;

import java.util.List;

import ua.kiev.model.entities.Subdivision;

public interface SubdivisionDao extends GenericMainDao<Subdivision>{
	
	List<Subdivision> getAll();
	Subdivision getName(String name);

}
