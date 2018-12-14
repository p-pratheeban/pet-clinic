package com.pratheeban.services;

import java.util.Set;

import com.pratheeban.model.Owner;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}