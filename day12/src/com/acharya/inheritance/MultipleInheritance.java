package com.acharya.inheritance;
class Father{
	void snooring() {
		System.out.println("I have snooring habit");
	}
}
class Mother{
	void snooring() {
		System.out.println("I have Snooring habit");
	}
}
class You extends Father, Mother{
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		You y = new You();
		y.snooring();
	}

}
