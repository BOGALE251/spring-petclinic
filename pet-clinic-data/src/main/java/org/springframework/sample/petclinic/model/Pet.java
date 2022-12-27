package org.springframework.sample.petclinic.model;

import jakarta.persistence.*;

@Entity
public class Pet extends NamedEntity {

	@ManyToOne()
	@JoinColumn(name = "owner_id")
	private Owner owner;
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
