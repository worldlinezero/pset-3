package exercise.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        System.out.println("Homework 1 :");
        float homeworkOne = grades.nextFloat();
        System.out.println("Homework 2 :");
        float homeworkTwo = grades.nextFloat();
        System.out.println("Homework 3 :");
        float homeworkThree = grades.nextFloat();
        System.out.println("Quiz 1 :");
        float quizOne = grades.nextFloat();
        System.out.println("Quiz 2 :");
        float quizTwo = grades.nextFloat();
        System.out.println("Test 1 :");
        float testOne = grades.nextFloat();
        double homeworkAverage = (((homeworkOne + homeworkTwo + homeworkThree) / 3) * .15);
        double quizAverage = (((quizOne + quizTwo) / 2) * .35);
        double testAverage = (testOne * .50);
        double weightedAverage = (homeworkAverage + quizAverage + testAverage);
        System.out.printf("\n%,.2f", weightedAverage);
        System.out.print("%.");
        grades.close();
    }
}