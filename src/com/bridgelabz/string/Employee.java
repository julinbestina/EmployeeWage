package com.bridgelabz.string;

import java.util.Random;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");
        int empCheck = (int)(Math.random()*10)%2;
         if(empCheck == 1) {
             System.out.println("Employee is present");
         }
         else {
             System.out.println("Employee is absent");
         }
    }

}
