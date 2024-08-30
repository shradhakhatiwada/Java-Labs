/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class NaturalNumbers {

    public static void main(String[] args) {
        int [] arr = new int[15];
        
        for (int i = 1;i<=15;i++){
            arr[i-1] = i;
        }
        
        int thirdEle= arr[2];
        int lastEle = arr[14];
        
        int sum = thirdEle+lastEle;
        
        System.out.println("The sum of 3rd and last element is:"+ sum);
    }
    
}
