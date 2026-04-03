// Define a sealed class
sealed class Person permits Student, Teacher {
    String name;

    Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}

// Subclass 1
final class Student extends Person {
    Student(String name) {
        super(name);
    }
}

// Subclass 2
final class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }
}

// Main class
public class Sealed1 {
    public static void main(String[] args) {
        Person s = new Student("Ashish Gri");
        Person t = new Teacher("Avadh Sir");

        s.printName();
        t.printName();
    }
}