package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Enter weight(kilogram):");
        weight= sc.nextDouble();
        System.out.println("Enter height (metter)");
        height= sc.nextDouble();
        bmi= weight/Math.pow(height,2);
        if(bmi<18.5){
            System.out.println(" thieu can");
        }
        else  if(bmi<=25.0){
            System.out.println("binh thuong");
        }
        else if(bmi<=30.0){
            System.out.println("thua can");
        }
        else {
            System.out.println("beo vl");
        }
    }
}
