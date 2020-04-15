package com.revature.beans;

public class Animal {
// class variables
	private int legs;
	private int age;
	private String name;
	private String species;
	
// Getters
	public int getLegs() {
		return legs;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecies() {
		return species;
	}

// Setters
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
// toString Override
	@Override
	public String toString() {
		if (legs == 0) {
			return "This animal is a #{age} year old #{species} named #{name} and has no legs, ";
		}
		else {
			return "This animal is a #{age} year old #{species} named #{name} and has #{legs} legs, ";
		}	
	}
}
