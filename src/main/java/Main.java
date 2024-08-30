// Base class: Student
class Student {
    // Instance variable
    int roll_no;

    // Method to read roll number
    void readRollNo(int roll) {
        roll_no = roll;
    }

    // Method to display roll number
    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Derived class: Test (inherits from Student)
class Test extends Student {
    // Instance variables to hold marks of two subjects
    int mark1, mark2;

    // Method to read marks
    void readMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    // Method to display marks
    void displayMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

// Derived class: Result (inherits from Test)
class Result extends Test {
    // Instance variable to hold total marks
    int total;

    // Method to calculate total marks
    void calculateTotal() {
        total = mark1 + mark2;
    }

    // Method to display total marks
    void displayTotal() {
        System.out.println("Total Marks: " + total);
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Result class
        Result student1 = new Result();

        // Reading roll number
        student1.readRollNo(101);

        // Reading marks
        student1.readMarks(85, 90);

        // Calculating total marks
        student1.calculateTotal();

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayRollNo();
        student1.displayMarks();
        student1.displayTotal();

        System.out.println(); // New line for separation

        // Creating another instance of the Result class
        Result student2 = new Result();

        // Reading roll number
        student2.readRollNo(102);

        // Reading marks
        student2.readMarks(75, 80);

        // Calculating total marks
        student2.calculateTotal();

        // Displaying student details
        System.out.println("Student 2 Details:");
        student2.displayRollNo();
        student2.displayMarks();
        student2.displayTotal();
    }
}

