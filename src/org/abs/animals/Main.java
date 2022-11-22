package org.abs.animals;

public class Main {

	public static void main(String[] args) {
		
		Dog homie = new Dog();
		
		Sparrow jack = new Sparrow();
		
		Eagle usa = new Eagle();
		
		Dolphin dol = new Dolphin();
		
		Animal[] animals = { homie, jack, usa, dol };
		
		for (int i = 0; i < animals.length; i++) {
			
			Animal animal = animals[i];

			animal.sleep();
			System.out.println(animal.verse() + "\n" + animal.eat());
			System.out.println("----------------------------------");
			
		}
		
	}
	
}
