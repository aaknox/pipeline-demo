package com.azhya.services;

import java.util.List;

import com.azhya.models.Character;

public interface CharacterService {
	public List<Character> getAllCharacters();
	public List<Character> saveCharacters(List<Character> cList);
	public boolean saveCharacter(Character character);
}
