import java.util.Scanner;

public class NetSalary {

    public static double taxCalculator(double number){
        double tax = number * 0.15;
        System.out.println(tax);
        double netSalary = number - tax;
        return netSalary;
    }

    public static void main (String[] args){
        System.out.println("Welcome to the Net Salary Program.");

        Scanner salary = new Scanner(System.in);
        System.out.println("Please enter your gross salary: ");
        double userSalary = salary.nextDouble();  // Read user input

        System.out.println("Your net salary is: " + taxCalculator(userSalary));
    }
}
