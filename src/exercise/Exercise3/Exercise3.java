package exercise.Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner measurements = new Scanner(System.in);
        System.out.println("Height :");
        float heightInInches = measurements.nextFloat();
        System.out.println("Width :");
        float widthInInches = measurements.nextFloat();
        float squareInches = (widthInInches * heightInInches);
        double areaInMillimeters = (squareInches * 645.16);
        System.out.printf("\n%,.2f", areaInMillimeters);
        System.out.print(" square millimeters.");
        measurements.close();
    }
}
