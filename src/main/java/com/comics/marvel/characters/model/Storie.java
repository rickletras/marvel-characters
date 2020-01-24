package com.comics.marvel.characters.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_STORIE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Storie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
	
	@Column(name = "STORIE", nullable = false)
	private String storie;
	
	@ManyToOne
	@JoinColumn(name = "CHARACTER_ID", nullable = false)
	private Character characters;

	public Storie() {}

	public Long getId() {
		return id;
	}
	
	public String getStorie() {
		return storie;
	}

	public void setStorie(String storie) {
		this.storie = storie;
	}

	public Character getCharacters() {
		return characters;
	}

	public void setCharacters(Character characters) {
		this.characters = characters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Storie other = (Storie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Storie [id=" + id + ", storie=" + storie + ", characters=" + characters + "]";
	}
}
