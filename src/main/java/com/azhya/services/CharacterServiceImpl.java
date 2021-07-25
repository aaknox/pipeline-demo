package com.azhya.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.azhya.models.Character;
import com.azhya.repositories.CharacterRepository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Service("characterService")
public class CharacterServiceImpl implements CharacterService {
	
	private static Logger log = Logger.getLogger(CharacterServiceImpl.class);
	
	@Autowired
	CharacterRepository characterRepo;
	
	@Override
	public List<Character> getAllCharacters() {
		log.info("CharacterService: retrieving characters from DB...");
		return characterRepo.findAll();
	}

	@Override
	public List<Character> saveCharacters(List<Character> cList) {
		log.info("CharacterService: Now trying to save a list of characters into DB...");
		return characterRepo.saveAll(cList);
	}

	@Override
	public boolean saveCharacter(Character character) {
		log.info("TEST: " + character.toString());
		log.info("CharacterService: Now trying to save character into DB...");
		Character tempCharacter = new Character(
				character.getCharacterId(), 
				character.getName(), 
				character.getImageURL(), 
				character.getBirthYear(), 
				character.getHomeworld(), 
				character.getGender(), 
				character.getHeight(), 
				character.getMass(), 
				LocalDateTime.now(), 
				LocalDateTime.now()
			);
		log.info("CharacterService: character being saved is: " + tempCharacter.toString());
		return characterRepo.saveAndFlush(tempCharacter) != null;
	}

}
