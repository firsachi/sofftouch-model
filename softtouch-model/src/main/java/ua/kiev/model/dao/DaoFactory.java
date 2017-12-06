package ua.kiev.model.dao;

public abstract class DaoFactory {
	
	public abstract UserDao createUserDaoImpl();
	public abstract RolesDao createRolesDaoImpl();
	public abstract SubdivisionDao createSubdivisionDao();
	
	public static DaoFactory getInstance() {
		try {
            Class<?> clazz = Class.forName("ua.kiev.model.dao.impl.DaoFactoryImpl");
            return (DaoFactory) clazz.newInstance();
        } catch (Exception ex){
            return null;
        }
	}

}
