package com.aj;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number:");
       int num=sc.nextInt();
       int count=0;
       for(int i=2;i<num/2;i++) {
    	   if(num%i==0) {
    		  count++; 
    	   }
       }
       
       if(count==0) {
    	   System.out.println("it is prime number");
       }else {
    	   System.out.println("it is not a prime number");
       }
        
    }
}
