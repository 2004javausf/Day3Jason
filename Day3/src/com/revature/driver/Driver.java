package com.revature.driver;
import com.revature.beans.Animal;
import com.revature.beans.Vehicle;
public class Driver {
		public static void main(String[] args) {
			Animal A= new Animal();
			Vehicle V= new Vehicle();
			A.setAge(5);
			A.setLegs(4);
			A.setName("Lion");
			A.setSpecies("Cat");
		
			V.setColor("Black");
			V.setDoors(4);
			V.setMake("Toyota");
			V.setModel("corolla");
			V.setWheels(4);
			V.setYear(2004);
			System.out.println("Animal Information");
		
			System.out.println(A.getAge());
			System.out.println(A.getLegs());
			System.out.println(A.getName());
			System.out.println(A.getSpecies());
			
			System.out.println("Vehicle Information");
			System.out.println(V.getColor());
			System.out.println(V.getDoors());
			System.out.println(V.getMake());
			System.out.println(V.getModel());
			System.out.println(V.getWheels());
			System.out.println(V.getYear());
		}
		
}
