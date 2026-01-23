public class Main {

    // Simple object (Student)
    static class Student {
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {

        try {
            // Object reference
            int age = -2; // try changing this to a valid number

            // Basic error handling
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            Student student1 = new Student("Alex", age);
            student1.displayInfo();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
