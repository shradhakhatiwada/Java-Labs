/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
interface Shape {
    double area(double x, double y);
    double perimeter(double x, double y);
}
class Rectangle implements Shape {
    // Instance variables
    private double length;
    private double breadth;

    // Constructor to initialize the length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implementation of area method
    @Override
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Implementation of perimeter method
    @Override
    public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to display the area and perimeter
    void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + area(length, breadth));
        System.out.println("Perimeter: " + perimeter(length, breadth));
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Displaying the area and perimeter
        rect.display();
    }
}
