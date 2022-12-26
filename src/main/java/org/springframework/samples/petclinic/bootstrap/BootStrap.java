package org.springframework.samples.petclinic.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repositories.OwnerRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private OwnerRepository ownerRepository;

	public BootStrap(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData(){
		Owner o = new Owner("John");
		Pet p = new Pet("Rocket");
		o.getPets().add(p);
		p.setOwner(o);

		ownerRepository.save(o);
	}
}
