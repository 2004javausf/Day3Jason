package com.revature.driver;

import com.revature.beans.*;

public class Driver {
	public static void main(String[] args) {
		Animal a = new Animal();
		Vehicle v = new Vehicle();
		a.setAge(2);
		v.setColor("blue");
		System.out.println(a.getAge());
		System.out.println(v.getColor());
	}

}
