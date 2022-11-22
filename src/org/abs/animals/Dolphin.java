package org.abs.animals;

public class Dolphin extends Animal implements CanSwin{

	@Override
	public String verse() {

		return "So long and thanks for all the fish";
	}

	@Override
	public String eat() {

		return "Pufferfish venom";
	}

	@Override
	public String swim() {

		return "Nuoto";
	}
	
}
