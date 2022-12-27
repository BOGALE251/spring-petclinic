package org.springframework.sample.petclinic.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Owner extends NamedEntity {

	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

	public Owner() {

	}
	public Owner(String name) {
		this.name = name;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
