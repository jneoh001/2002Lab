package lab1;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start,end,increment;
		
		System.out.println("Starting: ");
		start = sc.nextInt();
		System.out.println("End: ");
		end = sc.nextInt();
		System.out.println("Increment: ");
		increment = sc.nextInt();
		
		// error handling
		if(end < start) {
			System.out.println("Error!");
			return;
		}
			
		// For Loop
		System.out.println("US$\t\t\tS$");
		System.out.println("--------------------------------");
		for(int i=start; i<=end; i+=increment) {
			
			System.out.print(i);
			System.out.print("\t\t\t");
			System.out.println(i*1.82);
		}
		
		
		//While Loop
		int i = start;
		System.out.println("US$\t\t\tS$");
		System.out.println("--------------------------------");
		while( i <= end) {
			System.out.print(i);
			System.out.print("\t\t\t");
			System.out.println(i*1.82);	
			i += increment;
		}
		
		//Do While Loop
		System.out.println("US$\t\t\tS$");
		System.out.println("--------------------------------");
		i = start;
		do{
			System.out.print(i);
			System.out.print("\t\t\t");
			System.out.println(i*1.82);	
			i += increment;
		}while(i<=end);
		
				
	}

}
