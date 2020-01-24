package com.comics.marvel.characters.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comics.marvel.characters.model.Character;
import com.comics.marvel.characters.model.Comic;
import com.comics.marvel.characters.model.Storie;
import com.comics.marvel.characters.resources.exception.CharacterNotFoundException;
import com.comics.marvel.characters.service.CharacterService;

@RestController
@RequestMapping("/characters")
public class CharactersResource {

	@Autowired
	private CharacterService characterService;
	
	@GetMapping
	public List<Character> listCharacters() {
		return characterService.findAll();
	}
	
	@GetMapping("/{characterId}")
	public Character findCharacter(@PathVariable(value = "characterId") long id) throws CharacterNotFoundException {
		Character c = characterService.findById(id)
				.orElseThrow(() -> new CharacterNotFoundException(id));
		return c;
	}
	
	// GET characters/{characterId}/comics
	@GetMapping("/{characterId}/comics")
	public List<Comic> findCharacterComics(@PathVariable(value = "characterId") long id) {
		List<Comic> c = characterService.findComics(id);
		return c;
	}
	
	// GET characters/{characterId}/stories
	@GetMapping("/{characterId}/stories")
	public List<Storie> findCharacterStories(@PathVariable(value = "characterId") long id) {
		List<Storie> c = characterService.findStorie(id);
		return c;
	}
}
