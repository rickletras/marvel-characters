package com.comics.marvel.characters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comics.marvel.characters.model.Character;
import com.comics.marvel.characters.model.Comic;
import com.comics.marvel.characters.model.Storie;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {
	
	@Query("SELECT comic FROM Comic comic WHERE comic.character.id = ?1")
	List<Comic> findComics(long id);

	@Query("SELECT storie FROM Storie storie WHERE storie.character.id = ?1")
	List<Storie> findStorie(long id);
}
