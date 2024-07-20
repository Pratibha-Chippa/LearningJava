package Homework_Pgms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //program to find leap year or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the year you want to check");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +" is leap year.");
        }
        else
        {
            System.out.println(year +" is not a leap year.");
        }


    }
}
