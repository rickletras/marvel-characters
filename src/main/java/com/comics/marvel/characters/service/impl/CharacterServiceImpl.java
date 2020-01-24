package com.comics.marvel.characters.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comics.marvel.characters.model.Character;
import com.comics.marvel.characters.model.Comic;
import com.comics.marvel.characters.model.Storie;
import com.comics.marvel.characters.repository.CharacterRepository;
import com.comics.marvel.characters.service.CharacterService;

@Service
@Transactional
public class CharacterServiceImpl implements CharacterService {

	@Autowired
	CharacterRepository characterRepository;
	
	@Override
	public List<Character> findAll() {
		return (List<Character>) characterRepository.findAll();
	}

	@Override
	public Optional<Character> findById(long id) {
		return characterRepository.findById(id);
	}

	@Override
	public List<Comic> findComics(long id) {				
		return characterRepository.findComics(id);
	}

	@Override
	public List<Storie> findStorie(long id) {
		return characterRepository.findStorie(id);
	}
}
