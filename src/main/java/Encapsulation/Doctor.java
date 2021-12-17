package Encapsulation;

import java.util.Scanner;

public class Doctor extends Diagnosis {

    public static void main(String[] args) {
        System.out.println("Welcome to the Doctor's Office.");
        Scanner start = new Scanner(System.in);
        System.out.println("Would you like to examine a patient? Enter 'Y' or 'N': ");
        String test = start.next();  // Read user input
        Diagnosis doctor = new Diagnosis();
        doctor.startExam(test);
    }
}