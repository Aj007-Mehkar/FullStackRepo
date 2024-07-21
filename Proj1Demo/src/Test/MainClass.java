package Test;

import java.util.Scanner;

public class MainClass {
	public static int sum(int x,int y) {
		
		return x+y;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x value :");
		int x=sc.nextInt();
		
		System.out.println("enter y value :");
		int y=sc.nextInt();
		
		System.out.println("Sum is:"+sum(x,y));

	}

}
