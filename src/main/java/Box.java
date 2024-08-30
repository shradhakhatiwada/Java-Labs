/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Box {
    double length;
    double breadth;
    double height;
    
    
    void printDimensions(){
        System.out.println("Length:" + length);
        System.out.println("Breadth:" + breadth);
        System.out.println("Height:"+ height);
        
    }
    void printVolume(){
       double volume = length * breadth * height; 
        System.out.println("Volume:" + volume);
    }
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.length = 5.0;
        box1.breadth = 6.0;
        box1.height = 3.0;
        
        
        Box box2 = new Box();
        box2.length=3;
        box2.breadth= 2;
        box2.height= 4;
        
        System.out.println("Box 1:");
        box1.printDimensions();
        box1.printVolume();

        // Print the dimensions and volume for the second box
        System.out.println("\nBox 2:");
        box2.printDimensions();
        box2.printVolume();
    }
    
}
