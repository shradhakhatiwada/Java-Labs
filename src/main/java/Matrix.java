
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int [][] arr = new int[3][3];
            System.out.println("Enter elements of matrix:");
            for (int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  System.out.println("Element["+i+"]["+j+"]:");
                  arr[i][j]= s.nextInt();
                  
              }  
            }
            System.out.println("The matrix is:");
            for(int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            
          System.out.println("Displaying diagonal elements");
          for (int i=0;i<3;i++){
             System.out.println(arr[i][i]);
          }      
    }
}
