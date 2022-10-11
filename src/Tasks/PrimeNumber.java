package Tasks;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		
		int a = s.nextInt();
		int b = 0;
		for (int i = 1; i <=a; i++) {
			if(a%i==0) {
			b++;
	
		}
		}
			if (b==2) {
				System.out.println("prime no");
			
		}
			else  {
				System.out.println("not prime");
			}
			
		}
	}


