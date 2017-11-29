package ua.kiev.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "unit_organization")
public class OrganizationUnit {
	
	@Id
	@SequenceGenerator(name = "ids_unit", sequenceName = "ids_unit")
	@GeneratedValue(generator="ids_unit", strategy=GenerationType.SEQUENCE)
	@Column(name = "id_unit")
	private int id;
	
	@Column(name = "name")
	private String name;

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

	@Override
	public String toString() {
		return "UnitOrganization [id=" + id + ", name=" + name + "]";
	}
	
	
}
