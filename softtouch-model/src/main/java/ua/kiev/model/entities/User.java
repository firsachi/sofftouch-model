package ua.kiev.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "username", nullable=false, unique= true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "company_name", nullable = false)
	private String companyName;
	
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", companyName=" + companyName + "]";
	}

}
