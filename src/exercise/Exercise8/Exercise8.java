package exercise.Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in);
        System.out.println("Students :");
        int students = people.nextInt();
        System.out.println("Teachers :");
        int teachers = people.nextInt();
        System.out.println("Capacity :");
        int capacity = people.nextInt();
        int buses = (students + teachers + capacity - 1) / capacity;
        int overflow = (students + teachers) % capacity;
        System.out.println("\n" + "Buses required : " + buses);
        System.out.println("\n" + "Overflow passengers : " + overflow);
        people.close();
    }
}
