import java.util.Scanner;
// Create a student class that prints out name, surname,age and overall grade
// that a user inputs using constructors and methods


// Constructors in JAVA:
// No argument constructors - a constructor that doesn't take arguments
// constructor with parameters - "parametrized" constructor takes parameters in the arguments
// default constructor - will construct an object by default

// Rules
// name of constructor needs to match the class name
// must not have a return type

public class Student {
    String name;
    String surname;
    String age;
    String grade;
    String address;
    String major;
    String email;

    Student(String name, String surname, String age, String grade, String address, String major, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.address = address;
        this.major = major;
        this.email = email;
    }

//        Student (){
//            this.address="Main Street";
//            this.major="Mathematics";
//            this.email="bob@email.com";
//        }

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Database System");
        System.out.println("Please enter student info into the system using this format: 'Name', 'Surname', 'Age', 'Grade'");

        Scanner studentInfo = new Scanner(System.in);
        System.out.println("Student name: ");
        String name = studentInfo.nextLine();  // Read user input

        System.out.println("Student surname: ");
        String surname = studentInfo.nextLine();  // Read user input

        System.out.println("Student age: ");
        String age = studentInfo.nextLine();  // Read user input

        System.out.println("Student grade: ");
        String grade = studentInfo.nextLine();  // Read user input

        System.out.println("Student address: ");
        String address = studentInfo.nextLine();  // Read user input

        System.out.println("Student major: ");
        String major = studentInfo.nextLine();  // Read user input

        System.out.println("Student email: ");
        String email = studentInfo.nextLine();  // Read user input

        Student object = new Student(name, surname, age, grade, address, major, email);
        System.out.println(object.name + ", " + object.surname + ", " + object.age + ", " + object.grade + ", "
                + object.address + ", " + object.major + ", " + object.email);

//            Student newObject = new Student();
//            System.out.println(newObject.address + ", " + newObject.major + ", " + newObject.email);


        // Student Maggie = new Student("Maggie", "Doe", 20, "B");
        // System.out.println(Maggie.name);
        // System.out.println(Maggie.surname);
        // System.out.println(Maggie.age);
        // System.out.println(Maggie.grade);

    }
}
