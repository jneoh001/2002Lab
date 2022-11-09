package lab2;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Lab2p1 {
	public static void main (String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1:  miltiplic ation test");
			System.out.println("2:  quotient using division by subtraction"); 
			System.out.println("3:  remainder using division by subtraction");
			System.out.println("4:  count  the  number of digits"); 
			System.out.println("5:  position of a digit");
			System.out.println("6:  extract all odd digits");
			System.out.println("7:  quit");
			choice = sc.nextInt();
			
			switch(choice) {
			// mulTest
			case 1:
				mulTest();
				break;
			// divide
			case 2:
				System.out.println("Please enter numbers for m and n");
				int m = sc.nextInt();
				int n = sc.nextInt();
				int answer = divide(m, n);
				System.out.print(answer + "\n");
				break;
			// Modulus
			case 3:
				System.out.println("Please enter numbers for m and n");
				int m1 = sc.nextInt();
				int n1 = sc.nextInt();
				int answer1 = modulus(m1, n1);
				System.out.print(answer1 + "\n");
				break;
			//  countDigits
			case 4:
				System.out.println("Please enter a number");
				int number = sc.nextInt();
				if(number <0) {
					System.out.println("Error Input!!");
					return;
				}
				else {
					int noDigits = countDigits(number);
					System.out.printf("n: %d \n", noDigits);
				}
				break;
			// Position
			case 5:
				System.out.println("Please enter a number followed by a target number");
				int positionNumber = sc.nextInt();
				int target = sc.nextInt();
				System.out.printf("Position = %d\n", position(positionNumber, target));
				break;
			case 6:
				System.out.println("Please enter a number");
				int number2 = sc.nextInt(); 
				if(number2 < 0) {
					System.out.println("Error input !!!");
					break;
				}
				System.out.printf("oddDigits = %d\n", extractOddDigits(number2));
				break;
			case 7:
				System.out.println("Program terminating...");
			}
		} while(choice<7);
	}
	
	
	
	
	public static void mulTest() {
		
		int correctCount = 0;
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		for(int i=0; i<5; i++) {
			int first_Digit = rn.nextInt(1,10);
			int second_Digit = rn.nextInt(1,10);
			int answer = first_Digit * second_Digit; 
			
			System.out.printf("How much is %d times %d?\n", first_Digit,second_Digit );
			int userinput = sc.nextInt();
			
			if(userinput == answer) correctCount++;			
		}
		
		System.out.printf("%d out of 5 are correct.", correctCount);
	}
	
	public static int divide(int m, int n) {
		int quotient = 0;
		
		if(m<n) return 0;
		
		while(m > 0 && m>=n) {
			m -= n;
			quotient++;
		}
		
		return quotient;
	}
	
	public static int modulus(int m, int n) {
		
		while( m>0 && m>=n) {
			m -= n;			
		}
		return m;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while(n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static int position(int n, int digit) {
		int position = 1;
		int pointer;
		
		while(n>0) {
			pointer = n%10;
			if(pointer == digit) return position;
			n = (n - pointer)/10;
			position++;
		}
		
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		long lastdigit = 0;
		int count = 0;
		long answer = 0;
		
		while(n>0) {
			lastdigit = n%10;
			if( (lastdigit % 2) == 1) {
				answer += ( Math.pow(10,count) * lastdigit);
				count++;
			}
			
			n /= 10;
		}
		
		return answer;
	}
}	
