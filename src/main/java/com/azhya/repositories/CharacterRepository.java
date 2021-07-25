package com.azhya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azhya.models.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

}
