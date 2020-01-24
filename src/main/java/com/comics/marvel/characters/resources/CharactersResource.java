package com.comics.marvel.characters.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.comics.marvel.characters.model.Character;
import com.comics.marvel.characters.repository.CharacterRepository;

@RestController
public class CharactersResource {

	@Autowired
	private CharacterRepository charactersRepository;
	
	@GetMapping("/characters")
	public List<Character> listCharacters() {
		return charactersRepository.findAll();
	}
	
	@GetMapping("/character/{id}")
	public Character findCharacter(@PathVariable(value = "id") long id) {
		return charactersRepository.findById(id);
	}
}
