package Encapsulation;

import java.util.Scanner;

public class Diagnosis implements SymptomChecker {
    public void flu() {
        System.out.println("Patient has the flu.");
        System.out.println("Please prescribe flu medicine.");
    }

    public void covid() {
        System.out.println("Patient has COVID-19.");
        System.out.println("Please prescribe flu medicine, and advise to quarantine.");
    }

    public void chickenPox() {
        System.out.println("Patient has chicken pox.");
        System.out.println("Please prescribe pain medicine, and advise to drink fluids and rest.");
    }

    public void gerd() {
        System.out.println("Patient has GERD");
        System.out.println("Please prescribe antacid medication, and advise to eat a bland diet.");
    }

    public void arthritis() {
        System.out.println("Patient has arthritis.");
        System.out.println("Please prescribe pain and arthritis medicine, and advise considering physical therapy.");
    }

    public void startExam(String newExam) {
        if (newExam.equals("y") || newExam.equals("Y")) {
            Scanner exam = new Scanner(System.in);
            System.out.println("What is the patient's main symptom? Enter : ");
            String symptoms = exam.next();  // Read user input
            System.out.println("Please wait, running the Symptom Checker... ");
            runExam(symptoms);
        } else {
            System.out.println("Thanks for running the Symptom Checker!");
        }
    }

// flu - sneezing, fever, sore throat
// covid - coughing, difficulty breathing, loss of smell
// chicken pox - rash, fever, itchiness
// gerd - heartburn
// arthritis - pain in joints, difficulty moving

    public void runExam(String symptoms) {

        Scanner symptomScanner = new Scanner(System.in);
        String nextExam;
        switch (symptoms) {
            case "sneezing", "fever", "sore throat" -> {
                flu();
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
            case "coughing", "difficulty breathing", "loss of smell" -> {
                covid();
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
            case "rash", "itchiness" -> {
                chickenPox();
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
            case "heartburn" -> {
                gerd();
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
            case "pain in joints", "difficulty moving" -> {
                arthritis();
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
            default -> {
                System.out.println("Error. Symptom Checker could not find this symptom, please try another symptom.");
                System.out.println("Would you like to run another exam? Type Y or N: ");
                nextExam = symptomScanner.next();
                startExam(nextExam);
            }
        }
    }
}
