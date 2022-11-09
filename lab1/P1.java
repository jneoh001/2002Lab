package lab1;
import java.util.Scanner;

/**
 * @author Javier Neoh
 *
 */
public class P1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type A if you're an Action Movie Fan\n,"
					+ "B if you're a Comedy movie fan and\n"
					+ "C if  you're a Drama movie fan\n");
			char c = sc.next().charAt(0);
			
			switch(c) {
			case 'A':
			case 'a':
				System.out.println("Action movie fan\n");
				break;
			
			case 'B':
			case 'b':
				System.out.println("Comedy movie fan\n");
				break;
				
			case 'C':
			case 'c':
				System.out.println("Drama movie fan\n");
				break;
			
			default:
				System.out.println("Invalid Choice\n");
					
			}		

	}

}
