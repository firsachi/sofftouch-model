package ua.kiev.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4932831319362682848L;

	@Id
	@SequenceGenerator(name = "userIds", sequenceName = "user_ids", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userIds")
	@Column(name = "id")
	private int id;
	
	@Column(name = "username", nullable=false, unique= true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id")) 
	private List<Role> roles;

	@ManyToOne
	@JoinColumn(name = "company")
	private Company company;
	
	@Column(name = "disable", columnDefinition = "boolean default false")
	private boolean disable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRole() {
		return roles;
	}

	public void setRole(List<Role> roles) {
		this.roles = roles;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	
}
