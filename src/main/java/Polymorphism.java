/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Polymorphism {
    private int age, rollNumber;

	public Polymorphism() {
	}

	public Polymorphism(int age) {
		this.age = age;
	}

	public Polymorphism(int age, int rollNumber) {
		this.age = age;
		this.rollNumber = rollNumber;
	}

	public void shape(int length) {
		System.out.println("Length of this shape is: " + length);
	}

	public void shape(int length, int breadth) {
		System.out.println("Length is: " + length + " breadth is: " + breadth);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polymorphism object = new Polymorphism();
		object.shape(5);
		object.shape(5, 10);
		
		Polymorphism object2 = new Polymorphism(23);
		Polymorphism object3 = new Polymorphism(23, 211843);
	}

}
