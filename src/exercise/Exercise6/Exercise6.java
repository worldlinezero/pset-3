package exercise.Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner wageAndHours = new Scanner(System.in);
        System.out.println("Wage :");
        float wage = wageAndHours.nextFloat();
        System.out.println("Monday :");
        float monday = wageAndHours.nextFloat();
        System.out.println("Tuesday :");
        float tuesday = wageAndHours.nextFloat();
        System.out.println("Wednesday :");
        float wednesday = wageAndHours.nextFloat();
        System.out.println("Thursday :");
        float thursday = wageAndHours.nextFloat();
        System.out.println("Friday :");
        float friday = wageAndHours.nextFloat();
        System.out.println("Saturday :");
        float saturday = wageAndHours.nextFloat();
        System.out.println("Sunday :");
        float sunday = wageAndHours.nextFloat();
        double hours = (monday + tuesday + wednesday + thursday + friday + saturday + sunday);
        double grossPay = (hours * wage);
        System.out.printf("\n$%,.2f,", grossPay);
        System.out.print(".");
        wageAndHours.close();
    }
}