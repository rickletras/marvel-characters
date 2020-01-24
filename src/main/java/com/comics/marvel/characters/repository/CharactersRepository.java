package com.comics.marvel.characters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comics.marvel.characters.model.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Long> {

}
