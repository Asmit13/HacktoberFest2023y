// File Name: MyClass.java

public class MyClass {
    // Class Variables
    private int number;
    private String name;

    // Constructor
    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // Getter and Setter Methods
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    // Main Method (entry point of the program)
    public static void main(String[] args) {
        MyClass obj = new MyClass(42, "John");
        obj.displayInfo();
    }
}
