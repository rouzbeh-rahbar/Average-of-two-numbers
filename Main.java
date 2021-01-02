package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter  number 1 : ");
	int n=sc.nextInt();
	System.out.print("Enter  number 2 : ");
	int m=sc.nextInt();
	double d=(m+n)/2;
	System.out.println("Average is "+ d);

    }
}
