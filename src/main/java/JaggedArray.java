/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class JaggedArray {
     public static void main(String[] args) {
        
        int[][] jaggedArray = new int[3][];

        // Initialize each row of the jagged array with different lengths
        jaggedArray[0] = new int[3]; 
        jaggedArray[1] = new int[2]; 
        jaggedArray[2] = new int[4]; 
        // Assigning values to the jagged array
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    
}
