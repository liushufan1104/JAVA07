package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        int countN,total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 'n' ");
        countN = scanner.nextInt();
        for(;countN>0;countN--){
            total+=countN;
        }
        System.out.println("Add to the sum of n is "+total);
    }
}