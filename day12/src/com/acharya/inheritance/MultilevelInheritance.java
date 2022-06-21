package com.acharya.inheritance;
class animal{
	void eat() {
		System.out.println("eating");
	}

}
class dog extends animal{
void bark() {
	System.out.println("Barking");
}
}
class babydog extends dog{
	void weep() {
		System.out.println("weeping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		babydog b = new babydog();
		dog d= new dog();
		animal a= new animal();
		dog d1 = new babydog();
		animal a1 = new animal();
		b.bark();
		b.eat();
		b.weep();
		

	}

}
