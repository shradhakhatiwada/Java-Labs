/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class MultipleCatchExample {
   public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // Will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        } finally {
            System.out.println("Finally block executed in multiple catch example.");
        }
    } 
}
