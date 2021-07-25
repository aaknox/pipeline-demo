package com.azhya.controllers;

import static com.azhya.util.ClientMessageImpl.CREATION_FAILED;
import static com.azhya.util.ClientMessageImpl.SUCCESSFULLY_CREATED;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azhya.models.Character;
import com.azhya.services.CharacterService;
import com.azhya.util.ClientMessage;

@RestController("characterController")
@RequestMapping("/character")
public class CharacterController {
	
	private static Logger log = Logger.getLogger(CharacterController.class);
	
	@Autowired
	CharacterService characterService;
	
	@PostMapping(path="/create", consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ClientMessage> createNewCharacter(@RequestBody Character character) {
		log.info("CharacterController: User is making a POST request to add character to DB.");
		log.info("CharacterController: Character retrieved from client side - " + character.toString());
		ClientMessage body = characterService.saveCharacter(character) ? SUCCESSFULLY_CREATED : CREATION_FAILED;
		log.info("CharacterController: createNewCharacter request has been completed.");
		return ResponseEntity.status(HttpStatus.CREATED).body(body);
	}
	
	@GetMapping(path="/view/all", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Character>> viewAllCharacters() {
		log.info("CharacterController: User is making a GET request to retrieve characters from DB.");
		List<Character> characterList = characterService.getAllCharacters();
		log.info("CharacterController: Character list has been retrieved. List size: " + characterList.size() + ".");
		return ResponseEntity.ok(characterList);
	}
}
