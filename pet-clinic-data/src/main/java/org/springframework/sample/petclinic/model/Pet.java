package org.springframework.sample.petclinic.model;

import jakarta.persistence.*;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String name;

	@ManyToOne()
	@JoinColumn(name = "owner_id")
	private Owner owner;
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
