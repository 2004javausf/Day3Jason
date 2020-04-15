package com.revature.beans;

public class Vehicle {
// class variables
	private int wheels;
	private int doors;
	private String color;
	private String make;
	private String model;
	private int year;

// Getters
	public int getWheels() {
		return wheels;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}

// Setters
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
// toString Ovveride
	@Override
	public String toString() {
		if (wheels == 0) {
			return "This is a #{color}, #{year} #{make} #{model} with no wheels and #{doors} doors";
		}
		else if (doors == 0) {
			return "This is a #{color}, #{year} #{make} #{model} with #{wheels} wheels and no doors";
		}
		else if (wheels == 0 && doors == 0) {
			return "This is a #{color}, #{year} #{make} #{model} with no wheels and no doors";
		}
		else {
			return "This is a #{color}, #{year} #{make} #{model} with #{wheels} wheels and #{doors} doors";
		}
		
	}

}
