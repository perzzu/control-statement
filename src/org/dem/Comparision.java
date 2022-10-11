package org.dem;

import java.util.Scanner;

public class Comparision {
	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("enter a value");
		byte a = d.nextByte();
		System.out.println("a value is "+a);
		
		System.out.println("enter b value");
		short b = d.nextShort();
		System.out.println("b value is "+b);
		
		System.out.println("enter c value");
		int c = d.nextInt();
		System.out.println("c value is "+c);
		
		
		
		if (a>=b && a>=c) {
			System.out.println("a is greater");
			
		}
		else if (b>=a && b>=c) {
			System.out.println("b is greater");
			
		}
		else if(c>=a && c>=b){
			System.out.println("c is greater");
		}
	}

}
