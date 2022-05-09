package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonPropertyOrder({ 
	"playerID","birthYear","birthMonth","birthDay","birthCountry","birthState","birthCity","deathYear","deathMonth","deathDay","deathCountry","deathState","deathCity",
	"nameFirst","nameLast","nameGiven","weight","height","bats","throws","debut","finalGame","retroID","bbrefID" })
public class Player {
	
	@Id
	String playerID;
	String birthYear;
	String birthMonth;
	String birthDay;
	String birthCountry;
	String birthState;
	String birthCity;
	String deathYear;
	String deathMonth;
	String deathDay;
	String deathCountry;
	String deathState;
	String deathCity;
	String nameFirst;
	String nameLast;
	String nameGiven;
	String weight;
	String height;
	String bats;
	String throwing;
	String debut;
	String finalGame;
	String retroID;
	String bbrefID;


	public String getPlayerID() {
		return playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getBirthCountry() {
		return birthCountry;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public String getBirthState() {
		return birthState;
	}
	public void setBirthState(String birthState) {
		this.birthState = birthState;
	}
	public String getBirthCity() {
		return birthCity;
	}
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}
	public String getDeathYear() {
		return deathYear;
	}
	public void setDeathYear(String deathYear) {
		this.deathYear = deathYear;
	}
	public String getDeathMonth() {
		return deathMonth;
	}
	public void setDeathMonth(String deathMonth) {
		this.deathMonth = deathMonth;
	}
	public String getDeathDay() {
		return deathDay;
	}
	public void setDeathDay(String deathDay) {
		this.deathDay = deathDay;
	}
	public String getDeathCountry() {
		return deathCountry;
	}
	public void setDeathCountry(String deathCountry) {
		this.deathCountry = deathCountry;
	}
	public String getDeathState() {
		return deathState;
	}
	public void setDeathState(String deathState) {
		this.deathState = deathState;
	}
	public String getDeathCity() {
		return deathCity;
	}
	public void setDeathCity(String deathCity) {
		this.deathCity = deathCity;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	public String getNameGiven() {
		return nameGiven;
	}
	public void setNameGiven(String nameGiven) {
		this.nameGiven = nameGiven;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBats() {
		return bats;
	}
	public void setBats(String bats) {
		this.bats = bats;
	}
	public String getThrowing() {
		return throwing;
	}
	public void setThrowing(String throwing) {
		this.throwing = throwing;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getFinalGame() {
		return finalGame;
	}
	public void setFinalGame(String finalGame) {
		this.finalGame = finalGame;
	}
	public String getRetroID() {
		return retroID;
	}
	public void setRetroID(String retroID) {
		this.retroID = retroID;
	}
	public String getBbrefID() {
		return bbrefID;
	}
	public void setBbrefID(String bbrefID) {
		this.bbrefID = bbrefID;
	}
	
	
}
