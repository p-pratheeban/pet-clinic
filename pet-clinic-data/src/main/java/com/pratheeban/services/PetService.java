package com.pratheeban.services;

import java.util.Set;

import com.pratheeban.model.Pet;

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
