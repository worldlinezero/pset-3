package exercise.Exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        System.out.println("Fahrenheit :");
        float fahrenheit = temperature.nextFloat();
        double celsius = ((fahrenheit - 32) * (5.0 / 9.0));
        double kelvin = ((fahrenheit - 32) * (5.0 / 9.0) + 273.15);
        System.out.print("\n" + "Celsius : ");
        System.out.printf("%,.2f", celsius);
        System.out.print("\n" + "Kelvin : ");
        System.out.printf("%,.2f", kelvin);
        temperature.close();
    }
}