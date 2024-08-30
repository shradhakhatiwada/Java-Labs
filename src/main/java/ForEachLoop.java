/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ForEachLoop {
    
     public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Using for-each loop to iterate over the array
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Using for-each loop to iterate over the array of strings
        System.out.println("\nUsing for-each loop for strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
