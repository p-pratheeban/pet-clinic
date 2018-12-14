package com.pratheeban.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.pratheeban.model.Owner;
import com.pratheeban.model.Vet;
import com.pratheeban.services.OwnerService;
import com.pratheeban.services.VetService;
import com.pratheeban.services.map.OwnerMapService;
import com.pratheeban.services.map.VetMapService;

public class DataLoder implements CommandLineRunner {
	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoder(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = new OwnerMapService();
		this.vetService = new VetMapService();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(1L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		ownerService.save(owner2);

		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);

		System.out.println("Loaded Vets....");

	}

}