package Tasks;

public class Four {
	public static void main(String[] args) {
		int a=0;
		for (int i = 1; i <=100; i++) {
			
			
			if (i%2==1) {
			
				 a = a + i;
				//System.out.println(i);
			}
			
		}
		System.out.println("Total no odd sum:"+a);

	}

}
