package exercise.Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner measurements = new Scanner(System.in);
        System.out.println("Height :");
        float heightInInches = measurements.nextFloat();
        System.out.println("Length :");
        float lengthInInches = measurements.nextFloat();
        double squareInches = (lengthInInches * heightInInches);
        double areaInMillimeters = (squareInches * 645.16);
        System.out.println("Height : " + heightInInches + "\n" + "Length : " + lengthInInches + "\n\n" + areaInMillimeters + " square millimeters.");
    }
}
