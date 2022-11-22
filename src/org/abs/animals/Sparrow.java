package org.abs.animals;

public class Sparrow extends Animal implements CanFLy {

	@Override
	public String verse() {

		return "Yo i'm Jack";
	}

	@Override
	public String eat() {

		return "Rum";
	}

	@Override
	public String fly() {

		return "I'm a crow man";
	}

}
