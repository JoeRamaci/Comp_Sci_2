package com.company.Week_2;

import java.sql.SQLOutput;

public class Week2 {
    public static void main(String[] args) {
        System.out.println(6/2);
        System.out.println(7./2.); // floating point (double in java)
        System.out.println(40*14.25);
        double hoursWorked = 40; // Inline initialization
        double hourlyWage; // Variable declaration
        hourlyWage = 14.25; // Variable assignment
        System.out.println(hoursWorked * hourlyWage);
        boolean integerEntered = false;
        System.out.println(!integerEntered); // '!' before a bool inverts it
        System.out.println(true && false); // '&&' is 'and'
        System.out.println(true || false); // '||' is 'or'
        System.out.println(true | false);
        String name;
        name = "Joe"; // Single quote (') is a 'char', not a String (")
        System.out.println(name);
        System.out.println(name);
    }
}
