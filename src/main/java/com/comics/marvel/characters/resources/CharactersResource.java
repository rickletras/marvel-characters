package com.comics.marvel.characters.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comics.marvel.characters.model.Characters;
import com.comics.marvel.characters.repository.CharactersRepository;

@RestController
public class CharactersResource {

	@Autowired
	private CharactersRepository charactersRepository;
	
	@GetMapping("/characters")
	public List<Characters> listCharacters() {
		return charactersRepository.findAll();
	}
}
