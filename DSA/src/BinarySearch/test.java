package BinarySearch;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Welcome to CGPA calculator: ");
        System.out.println();
        System.out.println("Enter CGPA yet: ");
        float cgpa = in.nextFloat();
        System.out.println("Enter credit yet (excluding non- graded)");
        float creditYet = in.nextFloat();
        System.out.println("Enter GPA of this sem:  ");
        float gpa = in.nextFloat();
        System.out.println("Enter no of credit this sem (excluding non- graded)");
        float credit = in.nextFloat();

        cgpa = ((cgpa*creditYet)+(gpa*credit))/(credit+ creditYet);
        System.out.format("%.2f",cgpa);

    }
}
