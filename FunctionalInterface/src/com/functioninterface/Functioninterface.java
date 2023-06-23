package com.functioninterface;
@FunctionalInterface
interface A{
	void show();
	//Modify a functional interface, you use the default keyword
	default void display() {
		System.out.println("It is not on display");
	}
}
interface B{
	void greeting();
}
interface C{
	int getLength(String str);
}
public class Functioninterface {
	public static void main(String[] args) {
//		You can have a lot of statements then you will need the curly braces
		A obj = ()->System.out.println("Show on screen");
		obj.show();
		obj.display();
//		USING ANOVYMOUS CLASS
		B obj1 = new B() {
			public void greeting(){
				System.out.println("Hello world");
			}
	};
		obj1.greeting();
		C obj2 = str->str.length();
		System.out.println(obj2.getLength("lawrence"));
}
}
