package com.velocity;

//1.Make Class as a Final
//2.Make Variables as private
//3.Make variables as final
//4. don't provides setter method to variables
//5.to initialized variable use parameterized constructor
//6.Main Method and create a object
//7.Make deep copy for object-we can create a new object
//***shallow copy means we can use actual object for operation or reference 

public final class Immutable {

	private final int id;
	private final String name;
	private final Engine engine;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Immutable(int id, String name, Engine e) {
		this.id = id;
		this.name = name;
		Engine newEngine = new Engine(e.speed);
		this.engine = newEngine;

	}

	public static void main(String[] args) {
		Engine e=new Engine(50);
		Immutable immutable = new Immutable(1, "sayali", e);
		System.out.println(immutable.id);
		System.out.println(immutable.name);
		System.out.println(immutable.engine.speed);
		e.speed=70;
		System.out.println(immutable.engine.speed);

	}

}
