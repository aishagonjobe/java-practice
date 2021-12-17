package Teacher;//        Teacher.Teacher class must implement methods
//        markTest method is a small test, ask user whats 1+1
//        if they get it wrong print you got it wrong, and give F score,
//        if they get it right print you got it right and give A score
//
//        discipline method
//        ask user what they did, if they talked during class,
//        discipline with 5 demerits, if they backchatted, discipline with 10 demerits,
//        if they were caught smoking discipline with suspension
//        if they were caught fighting discipline with explusion
//
//
//        teach method
//        just returns simple print statement saying the class is teaching
//
//
//        create Reports
//        asks user for name
//        ask user for surname
//        ask user for grade,
//        print out name, surname and grade

import java.util.Scanner;

public class Teacher implements TeacherManual {

    public void markTests(){
        System.out.println("Student, please take the math test.");
        System.out.println("What is 1+1?");

        Scanner test = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = test.nextInt();  // Read user input

        if (num == 2){
            System.out.println("Correct! You have passed the test. Your score is 'A'.");
        } else {
            System.out.println("Sorry, you have failed the test. Your score is 'F'.");

        }
    }

    public void discipline(){
        System.out.println("You are in discipline mode.");
        System.out.println("What did the student do?");
        System.out.println("Talking during class, Back-chatted, caught smoking, or caught fighting?");

        Scanner discipline = new Scanner(System.in);
        System.out.println("Enter student's action: ");
        String action = discipline.nextLine();  // Read user input

        String punishment;

        switch (action) {
            case "Talking during class":
                punishment = "5 demerits.";
                break;

            case "Back-chatted":
                punishment = "10 demerits.";
                break;

            case "Caught smoking":
                punishment = "Suspension.";
                break;

            case "Caught fighting":
                punishment = "Expulsion.";
                break;

            case "talking during class":
                punishment = "5 demerits.";
                break;

            case "back-chatted":
                punishment = "10 demerits.";
                break;

            case "caught smoking":
                punishment = "Suspension.";
                break;

            case "caught fighting":
                punishment = "Expulsion.";
                break;

            default:
                punishment = "No punishment, give student a warning.";
                break;
        }
        System.out.println("The punishment is: " + punishment);
    }

    public void teach(){
        System.out.println("The class is teaching.");
    }

    public void createReports(){
        System.out.println("You are in Report Mode");
        System.out.println("Please enter the student's first name, surname, and grade.");

        Scanner report = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        String name = report.nextLine();  // Read user input

        System.out.println("Enter student's last name: ");
        String surname = report.nextLine();  // Read user input

        System.out.println("Enter student's overall grade: ");
        String grade = report.nextLine();  // Read user input

        System.out.println("Student info: " + name + " " + surname + ", Overall Grade: " + grade + ".");
    }
}
