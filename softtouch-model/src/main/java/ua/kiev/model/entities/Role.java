package ua.kiev.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@SequenceGenerator(name = "roleId", sequenceName = "role_ids")
public class Role implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3425729982743504056L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roleId")
	@Column(name = "id")
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "name_role")
	private RoleEnum nameRole;
	
	 @ManyToMany(mappedBy = "roles")
	 private List<User> users;
	 
	    @ManyToMany
	    @JoinTable(
	        name = "roles_privileges", 
	        joinColumns = @JoinColumn(
	          name = "role_id", referencedColumnName = "id"), 
	        inverseJoinColumns = @JoinColumn(
	          name = "privilege_id", referencedColumnName = "id"))
	    private List<Privilege> privileges;
	
	public Role() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoleEnum getNameRole() {
		return nameRole;
	}

	public void setNameRole(RoleEnum nameRole) {
		this.nameRole = nameRole;
	}


}
