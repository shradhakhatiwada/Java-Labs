/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Calling the add method with two integers
        System.out.println("Sum of 10 and 20: " + example.add(10, 20));

        // Calling the overloaded add method with three integers
        System.out.println("Sum of 10, 20, and 30: " + example.add(10, 20, 30));

        // Calling the overloaded add method with two doubles
        System.out.println("Sum of 10.5 and 20.5: " + example.add(10.5, 20.5));
    }
}

