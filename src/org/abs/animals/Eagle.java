package org.abs.animals;

public class Eagle extends Animal implements CanFLy {

	@Override
	public String verse() {

		return "Born in the USAAA";
	}

	@Override
	public String eat() {

		return "Oil";
	}

	@Override
	public String fly() {

		return "Voloh";
	}

}
