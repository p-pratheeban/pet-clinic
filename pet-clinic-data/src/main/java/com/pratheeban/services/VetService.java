package com.pratheeban.services;

import java.util.Set;

import com.pratheeban.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
