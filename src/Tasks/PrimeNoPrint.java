package Tasks;

import java.util.Scanner;

public class PrimeNoPrint {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int a = s.nextInt();
		

		for (int i = 2; i <=a; i++) {
			int count = 0;
			

			for (int j = 2; j < i; j++) {
				
				if(i%j==0) {
					count++;
			
				}
	
			}
			if (count==0) {
				System.out.println(i);
			
		}
			
		}
		
		
			
			
		}
	}


	
	

