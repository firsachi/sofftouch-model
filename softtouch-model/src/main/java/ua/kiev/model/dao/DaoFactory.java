package ua.kiev.model.dao;

public abstract class DaoFactory {
	
	public abstract UserDao createUserDaoImpl();
	public abstract RoleDao createRolesDaoImpl();
	public abstract SubdivisionDao createSubdivisionDao();
	public abstract CompanyDao createCompanyDao();
	
	public static DaoFactory getInstance() {
		try {
            Class<?> clazz = Class.forName("ua.kiev.model.dao.impl.DaoFactoryImpl");
            return (DaoFactory) clazz.newInstance();
        } catch (Exception ex){
            return null;
        }
	}

}
