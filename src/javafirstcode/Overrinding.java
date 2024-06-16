package javafirstcode;

public class Overrinding {
	class Animal {

		void behave() {
			System.out.println("Animals eat and sleep.");
		}

	}

	class Dog extends Animal {
		@Override
		void behave() {
			System.out.println("Dog can smell and protect their owner");
		}
	}

	class Cat extends Animal {
		@Override
		void behave() {
			System.out.println("Cat can sense the things");
		}
	}

	public static void main(String[] args) {
		
		Overrinding overrinding= new Overrinding();
		Animal animal = overrinding.new Animal();
		Dog dog = overrinding.new Dog();
		dog.behave();
		animal.behave();
	}

}


