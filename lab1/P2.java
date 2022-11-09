package lab1;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Salary amount: ");
		int salary = sc.nextInt();
		System.out.println("Please enter your merit points: ");
		int meritPoints = sc.nextInt();
		
		int grade = -1;
		
		if(salary >= 500 && salary <= 599) {
			grade = 3;
		}
		
		if(salary >= 600 && salary <= 649){
			if(meritPoints >= 10) {
				grade = 2;
			}
			else grade = 3;
		}
		
		if(salary >= 650 && salary <= 699) {
			grade = 2;
		}
		
		if(salary >= 700 &&  salary <= 799) {
			if(meritPoints >= 20) {
				grade = 1;
			}
			else grade = 2;
		}
		
		if(salary >= 800 && salary <= 899) {
			grade = 1;
		}
		
		
		switch(grade){
		case 3:
			System.out.println("Grade C");
			break;
		case 2:
			System.out.println("Grade B");
			break;
		case 1:
			System.out.println("Grade A");
			break;
		default:
			System.out.println("There is an error.");
			break;
		}
		
	}
 
}
