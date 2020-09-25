package exercise.Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner measurements = new Scanner(System.in);
        System.out.println("Height :");
        float heightInInches = measurements.nextFloat();
        System.out.println("Width :");
        float widthInInches = measurements.nextFloat();
        float squareInches = (heightInInches * widthInInches);
        double areaInCentimeters = (squareInches * 6.4516);
        System.out.printf("\n%,.2f", areaInCentimeters);
        System.out.print(" square centimeters.");
        measurements.close();
    }
}
