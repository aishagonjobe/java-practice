package AreaInterface;

import java.util.Scanner;

public class AreaMethods implements Area {

    public static double area(int s){
        int squareArea = s*s;
        return squareArea;
    }

    public static double area(int h, int w){
        int rectangleArea = h*w;
        return rectangleArea;
    }

    public static double area(int r, int r2, double pi ){
        double circleArea = r*r2*pi;
        return circleArea;
    }

    public static double areaCalculator(String shape){
        Scanner lengths = new Scanner(System.in);
        double pi = 3.14;

        double area = 0;
        switch (shape) {
            case "square" -> {
                System.out.println("Enter side length: ");
                int sSide = lengths.nextInt();  // Read user input
                area = area(sSide);
            }
            case "rectangle" -> {
                System.out.println("Enter height: ");
                int rHeight = lengths.nextInt();  // Read user input
                System.out.println("Enter width: ");
                int rWidth = lengths.nextInt();  // Read user input
                area = area(rWidth, rHeight);
            }
            case "circle" -> {
                System.out.println("Enter radius: ");
                int cRadius = lengths.nextInt();  // Read user input
                area = area(cRadius, cRadius, pi);
            }
            default -> area = 0;
        }
        return area;
    }
}
