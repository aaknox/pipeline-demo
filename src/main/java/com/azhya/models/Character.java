package com.azhya.models;

import java.time.LocalDateTime;

import javax.persistence.*;

// SW Character Model
@Entity
@Table(name="characters")
public class Character {
	@Id
	@Column(name = "characterId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int characterId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "imageURL")
	private String imageURL;
	
	@Column(name = "birthYear")
	private String birthYear;
	
	@Column(name = "homeworld")
	private String homeworld;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "height")
	private int height;
	
	@Column(name = "mass")
	private int mass;
	
	@Column(name = "creationDate")
    private LocalDateTime creationDate;
	
	@Column(name = "lastModified")
    private LocalDateTime lastModified;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(int characterId, String name, String imageURL, String birthYear, String homeworld, String gender,
			int height, int mass, LocalDateTime creationDate, LocalDateTime lastModified) {
		super();
		this.characterId = characterId;
		this.name = name;
		this.imageURL = imageURL;
		this.birthYear = birthYear;
		this.homeworld = homeworld;
		this.gender = gender;
		this.height = height;
		this.mass = mass;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
	}

	public int getCharacterId() {
		return characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthYear == null) ? 0 : birthYear.hashCode());
		result = prime * result + characterId;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((homeworld == null) ? 0 : homeworld.hashCode());
		result = prime * result + ((imageURL == null) ? 0 : imageURL.hashCode());
		result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
		result = prime * result + mass;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Character other = (Character) obj;
		if (birthYear == null) {
			if (other.birthYear != null)
				return false;
		} else if (!birthYear.equals(other.birthYear))
			return false;
		if (characterId != other.characterId)
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (height != other.height)
			return false;
		if (homeworld == null) {
			if (other.homeworld != null)
				return false;
		} else if (!homeworld.equals(other.homeworld))
			return false;
		if (imageURL == null) {
			if (other.imageURL != null)
				return false;
		} else if (!imageURL.equals(other.imageURL))
			return false;
		if (lastModified == null) {
			if (other.lastModified != null)
				return false;
		} else if (!lastModified.equals(other.lastModified))
			return false;
		if (mass != other.mass)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Character [characterId=" + characterId + ", name=" + name + ", imageURL=" + imageURL + ", birthYear="
				+ birthYear + ", homeworld=" + homeworld + ", gender=" + gender + ", height=" + height + ", mass="
				+ mass + ", creationDate=" + creationDate + ", lastModified=" + lastModified + "]";
	}
}
