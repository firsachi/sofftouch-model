package ua.kiev.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3425729982743504056L;

	@Id
	@Enumerated(EnumType.STRING)
	@Column(name = "name_role")
	private RoleEnum nameRole;
	
	public Role() {
	}

	public Role(RoleEnum nameRole) {
		this.nameRole = nameRole;
	}

	public RoleEnum getNameRole() {
		return nameRole;
	}

	public void setNameRole(RoleEnum nameRole) {
		this.nameRole = nameRole;
	}

	@Override
	public String toString() {
		return "Role [nameRole=" + nameRole + "]";
	}
	
	
}
