package com.acharya.inheritance;
class animal{
	 void eat() {
		 System.out.println("eating");
	 }	
}
class Dog extends animal{
	void bark() {
		System.out.println("barking");
	}
}
class babydog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		babydog b = new babydog();
		Dog d = new Dog();
		animal a = new animal();
		Dog d1 = new babydog();
		animal a1 = new babydog();
		b.bark();
		b.eat();
		b.weep();
	}

}
