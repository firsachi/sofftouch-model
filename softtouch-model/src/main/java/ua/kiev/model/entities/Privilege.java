package ua.kiev.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Privilege {
	
	@Id
	@SequenceGenerator(name = "privilegeId", sequenceName = "privilege_ids", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "privilegeId")
    private Long id;
 
	@Column(name = "privilegeName", unique = true, nullable = false)
    private String privilegeName;
 
    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;
    
    
}
