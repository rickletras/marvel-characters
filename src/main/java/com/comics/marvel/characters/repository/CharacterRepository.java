package com.comics.marvel.characters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comics.marvel.characters.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
	
	Character findById(long id);
}
