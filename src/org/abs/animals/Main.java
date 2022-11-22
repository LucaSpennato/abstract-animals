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
		
		swim(homie.swim());
		swim(dol.swim());
		fly(usa.fly());
		fly(jack.fly());
	}
	
	public static void fly(String args) {
		System.out.println(args);
	}
	
	public static void swim(String args) {
		System.out.println(args);
	}
	
}
