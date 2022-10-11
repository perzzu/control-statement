package Tasks;

import java.util.Scanner;

public class FirstQuestion {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter age");
		int a = s.nextInt();
		
		
		if (a>=18) {
			System.out.println("person eligible to vote");
		}
		
		else {
			System.out.println("person is not eligible to vote");
		}
			
		
		
		
	}
	
	

}
