package com.fcocesar.cursospring.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcocesar.cursospring.domain.Categoria;
import com.fcocesar.cursospring.repositories.CategoriaRepository;
import com.fcocesar.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto Não encontrado: " + id + 
				" Tipo do Objeto: " + Categoria.class.getName()));

	}

}
