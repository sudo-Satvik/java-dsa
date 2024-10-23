package data_structure.linkedlist.basics;
/*
Classes: Allow you to define attributes and behaviors, creating objects with state and methods.
Enums: Useful for defining a fixed set of constants.
Interfaces: Define a contract for methods that classes must implement.
Records: Provide a concise syntax for immutable data-holding classes with auto-generated methods.
 */
class UsingClass{
   // Field (attributes)
   int id;
   String name;
   float marks;

   // Constructor to initialize the student object
    public UsingClass(int id, String name, float marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method to check if the student has passed (marks >= 40)
    public boolean hasPassed() {
        return marks >= 40;
    }
}
// Using Enums
enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
// Using Interface
interface Animal{
    void sound();   // abstract method
    void sleep();   // abstract method
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("barking...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}
public class A_UserDefinedDatatype {
    public static void main(String[] args) {
        UsingClass student1 = new UsingClass(101, "Satvik Sharma", 99.9f);
        UsingClass student2 = new UsingClass(102, "Mayank Sharma", 95.6f);

        // Displaying the result
        student1.displayDetails();
        System.out.println("============================");
        student2.displayDetails();
        System.out.println("++++++++++++++++++++++++++++");
        // Checking for passed
        System.out.println("Has Passed: "+student1.hasPassed());
        System.out.println("Has Passed: "+student2.hasPassed());

        System.out.println("+++++++++++++++++++++++++++++++++");

        Days today = Days.WEDNESDAY;
        switch (today){
            case MONDAY -> System.out.println("Start of the work week!");
            case WEDNESDAY -> System.out.println("It's midweek");
            case FRIDAY -> System.out.println("Weekend is near!");
            default -> System.out.println("Just another day.");
        }
        // Loop through all enum values
        System.out.println("\nDays of the week: ");
        for (Days day : Days.values()){
            System.out.println(day);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");
        // Using Interface
        Animal dog = new Dog();
        dog.sleep();
    }
}
