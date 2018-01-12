package ua.kiev.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@SequenceGenerator(name = "companyIds", sequenceName = "company_ids", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "companyIds")
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name", unique = true, nullable = false)
	private String comapanyName;
	
	@Column(name = "disable")
	private boolean disable;
	
	@ManyToOne
	@JoinColumn(name = "subdivision")
	private Subdivision subdivision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComapanyName() {
		return comapanyName;
	}

	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public Subdivision getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(Subdivision subdivision) {
		this.subdivision = subdivision;
	}
	
	
	
}
