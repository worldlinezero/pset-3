package exercise.Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner deductions = new Scanner(System.in);
        System.out.println("Salary :");
        float salary = deductions.nextFloat();
        System.out.println("401(k) :");
        float retirement = deductions.nextFloat();
        System.out.println("Federal :");
        float federal = deductions.nextFloat();
        System.out.println("State :");
        float state = deductions.nextFloat();
        double biweekly = salary / 24;
        double afterRetirement = biweekly * (retirement/100);
        biweekly = biweekly - afterRetirement;
        double federalDeduction = biweekly * (federal/100);
        double stateDeduction = biweekly * (state/100);
        double totalDeduction = (federalDeduction + stateDeduction);
        double salaryAfterDeductions = biweekly - totalDeduction;
        System.out.printf("\n$%,.2f", salaryAfterDeductions);
        System.out.print(".");
        deductions.close();
    }
}