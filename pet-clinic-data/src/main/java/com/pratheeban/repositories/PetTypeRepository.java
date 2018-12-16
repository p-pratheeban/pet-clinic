package com.pratheeban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pratheeban.model.PetType;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
