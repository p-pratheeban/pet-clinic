package com.pratheeban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pratheeban.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
