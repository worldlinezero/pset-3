package exercise.Exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner change = new Scanner(System.in);
        System.out.println("Amount :");
        double amount = 100 * change.nextDouble();
        double quarters = amount / 25;
        quarters = (int) quarters;
        amount = amount % 25;
        double dimes = amount / 10;
        dimes = (int) dimes;
        amount = amount % 10;
        double nickels = amount / 5;
        nickels = (int) nickels;
        amount = amount % 5;
        double pennies = amount;
        pennies = (int) pennies;
        System.out.print("\n" + "Quarters : ");
        System.out.printf("%,.0f", quarters);
        System.out.print("\n" + "Dimes : ");
        System.out.printf("%,.0f", dimes);
        System.out.print("\n" + "Nickels : ");
        System.out.printf("%,.0f", nickels);
        System.out.print("\n" + "Pennies : ");
        System.out.printf("%,.0f", pennies);
        change.close();
    }
}