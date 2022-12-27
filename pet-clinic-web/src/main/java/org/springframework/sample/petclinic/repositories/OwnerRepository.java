package org.springframework.sample.petclinic.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.sample.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
