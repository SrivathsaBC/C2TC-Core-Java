package com.acharya.inheritance;
class animall{
	void eat() {
		System.out.println("eating");
	}

}
class dogg extends animall{
void bark() {
	System.out.println("Barking");
}
}
class cat extends animall{
	void meow() {
		System.out.println("meowing");
	}
}

public class HierachialInheritance {

	public static void main(String[] args) {
		cat c = new cat();
		dogg d = new dogg();
		c.eat();
		c.meow();
		d.eat();
		d.bark();
	

	}

}
