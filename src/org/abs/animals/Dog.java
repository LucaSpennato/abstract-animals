package org.abs.animals;

public class Dog extends Animal implements CanSwin {

	@Override
	public String verse() {
		
		return "Woof";
	}

	@Override
	public String eat() {

		return "Meat";
	}

	@Override
	public String swim() {

		return "I'm seal now";
	}

}
