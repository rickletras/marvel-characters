package com.comics.marvel.characters.resources.exception;

public class CharacterNotFoundException extends RuntimeException  {
	private static final long serialVersionUID = 1L;

	public CharacterNotFoundException(Long id) {
		super(String.format("Character is not found with id: '%s'", id));
	}

}
