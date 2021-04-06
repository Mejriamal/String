package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table( name = "User")
public class User  implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id; 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id= id;
	}
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	@Temporal (TemporalType.DATE)
	private Date dateDebut;
	public String toString() {
		return FirstName +" " + LastName;
		
	}
	public User(){};
	public User(String firstName, String lastName, Role role, Date dateDebut) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.role = role;
		this.dateDebut = dateDebut;
	}
	public User(long id, String firstName, String lastName, Role role, Date dateDebut) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.role = role;
		this.dateDebut = dateDebut;
	}

	
}