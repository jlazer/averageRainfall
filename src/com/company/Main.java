//  Justin Lazarski
//  CIS3090.04
//  3/4/19
//  Homework 2
package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        int years;
        final int months = 12;
        int totalMonths = 0;
        double monthlyRain = 0;
        double totalRainfall = 0;

        NumberFormat df = DecimalFormat.getInstance();
        df.setMaximumFractionDigits(2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        for (int i = 0; i < years; i++) {
            for (int j = 1; j < months + 1; j++) {
                switch (j) {
                    case 1:
                        System.out.print("January: ");
                        break;
                    case 2:
                        System.out.print("February: ");
                        break;
                    case 3:
                        System.out.print("March: ");
                        break;
                    case 4:
                        System.out.print("April: ");
                        break;
                    case 5:
                        System.out.print("May: ");
                        break;
                    case 6:
                        System.out.print("June: ");
                        break;
                    case 7:
                        System.out.print("July: ");
                        break;
                    case 8:
                        System.out.print("August: ");
                        break;
                    case 9:
                        System.out.print("September: ");
                        break;
                    case 10:
                        System.out.print("October: ");
                        break;
                    case 11:
                        System.out.print("November: ");
                        break;
                    case 12:
                        System.out.print("December: ");
                }
                monthlyRain = input.nextDouble();
                totalRainfall += monthlyRain;
            }
            totalMonths += months;
        }
        double averageRainfall = totalRainfall/totalMonths;
        System.out.println("");
        System.out.println("Total Months: " + totalMonths + "\n Total Rainfall: " + df.format(totalRainfall) + " inches " + "\n AverageRainfall: " + df.format(averageRainfall) + " inches");
    }
}

