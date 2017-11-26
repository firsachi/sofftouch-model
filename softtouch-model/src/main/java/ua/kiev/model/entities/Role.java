package ua.kiev.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@SequenceGenerator(name = "ids_role", sequenceName = "ids_role")
	@GeneratedValue(generator="ids_role",strategy=GenerationType.SEQUENCE)
	@Column(name="id_role")
	private int idRole;
	
	@Column(name = "name_role")
	private String nameRole;
	
	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nameRole=" + nameRole + "]";
	}
	
	

}
