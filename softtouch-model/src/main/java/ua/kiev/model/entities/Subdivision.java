package ua.kiev.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "subdivision")

public class Subdivision implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "sequenceSubdivision", sequenceName = "subdivision_ids", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceSubdivision")
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@OneToMany(mappedBy = "subdivision", fetch = FetchType.EAGER)
	private List<Company> companies;
	
	@Column(name = "delete", nullable = false)
	private boolean delete;

	public Subdivision() {
	}
	
	public Subdivision(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Company> getCompany() {
		return companies;
	}

	public void setCompany(List<Company> companies) {
		this.companies = companies;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
}
