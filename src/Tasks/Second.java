package Tasks;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number");
		
		int a = s.nextInt();
		
		if (a % 2 ==0) {
			System.out.println("number is even");
			
		}
		else {
			System.out.println("number is odd");
		}
		
	}

}
