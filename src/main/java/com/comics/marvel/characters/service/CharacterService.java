package com.comics.marvel.characters.service;

import java.util.List;
import java.util.Optional;

import com.comics.marvel.characters.model.Character;
import com.comics.marvel.characters.model.Comic;
import com.comics.marvel.characters.model.Storie;

public interface CharacterService {
	
	List<Character> findAll();

	Optional<Character> findById(long id);
	
	List<Comic> findComics(long id);

	List<Storie> findStorie(long id);
}
