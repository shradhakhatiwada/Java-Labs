public class OuterClass {

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }

    // Non-static nested class (Inner class)
    class InnerClass {
        void display() {
            System.out.println("Inside non-static nested class (Inner class).");
        }
    }

    // Method to demonstrate local inner class
    void demonstrateLocalInnerClass() {
        // Local inner class inside a method
        class LocalInnerClass {
            void display() {
                System.out.println("Inside local inner class.");
            }
        }

        // Creating an instance of the local inner class and calling its method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Creating an instance of the outer class
        OuterClass outer = new OuterClass();

        // Creating an instance of the non-static nested class (inner class)
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Demonstrating local inner class
        outer.demonstrateLocalInnerClass();
    }
}
