/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mark;

import java.util.Scanner;

/**
 *
 * @author Abhash
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = 0, per = 0;
        String subject[] = {"Science", "Math", "Social", "English", "Nepali"};
        double[] marks = new double[subject.length];

        Scanner s = new Scanner(System.in);
        while (true){
        System.out.print("Enter Name Of Student:");
        String w = s.next();
        System.out.print("Enter Student Symbol num:");
        String a = s.next();

        System.out.println("Enter marks in subjects");

        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i] + "\t");
            marks[i] = s.nextDouble();

        }
        for (int j = 0; j < subject.length; j++) {
            System.out.println(subject[j]);
            System.out.println(marks[j]);

        }
            System.out.println("=================================");
        System.out.println("------------YOUR MARKSHEET---------- \n");
        System.out.println("Science" + "\t \t \t" + marks[0]);
        System.out.println("Math" + "\t \t \t" + marks[1]);
        System.out.println("Social" + "\t \t \t" + marks[2]);
        System.out.println("English" + "\t \t \t" + marks[3]);
        System.out.println("Nepali" + "\t \t \t" + marks[4]);
            System.out.println("=================================");
        total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        per = total / 5;

        if (marks[0] >= 32 && marks[1] >= 32 && marks[2] >= 32 && marks[3] >= 32 && marks[4] >= 32) {

            System.out.println("Total" + "\t" + "\t" + "\t" + total);
            System.out.println("Percentage" + "\t" + "\t" + per);
        
            String Division = null;
            if (per >= 80) {
                Division = "DISTINCTION";
            } else if (per >= 60) {
                Division = "FIRST DIVISION";
            } else if (per >= 40) {
                Division = "SECOND DIVISION";
            } else {
                Division = "THIRD DIVISION";
            }
            System.out.println("Division" + "\t" + "\t" + Division);
        } else {
            System.out.println("FAILED");
        }

        System.out.println("Do you want to continue[Y/N]");
        String ch = s.next();
        if (ch.equalsIgnoreCase("n")) {
            System.exit(0);
        }
        
    }
    }
}
