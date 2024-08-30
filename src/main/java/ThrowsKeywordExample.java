/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ThrowsKeywordExample {
    
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
