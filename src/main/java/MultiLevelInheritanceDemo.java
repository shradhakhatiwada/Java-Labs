/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Animal {
    String name = "Animal";

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }

    void display() {
        System.out.println(" Animal class");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog(String name) {
        super(name);
        System.out.println("Dog constructor ");
    }

    void display() {
        super.display();
        System.out.println("Dog class");
    }

    void printName() {
        System.out.println("Name in superclass: " + super.name);
        System.out.println("Name in subclass: " + name);
    }
}

class Husky extends Dog {
    Husky(String name) {
        super(name);
        System.out.println("Husky constructor");
    }

    void display() {
        super.display();
        System.out.println("Husky class");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Husky husky = new Husky("Enzo");
        husky.display();
        husky.printName();
    }
}