public class test1{
    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Shape{
    double area;
    public void getAttributes(){}
    public void calArea(){}
    public double getArea(){
        return area;
    }
}

class Square extends Shape{
    int length;
    public void getAttributes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        length = input.nextInt();
    }
    public void calArea(){
        area = length * length;
    }
}

class Rectangle extends Shape{
    int length;
    int breath;
    public void getAttributes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = input.nextInt();
        System.out.println("Enter breath: ");
        breath = input.nextInt();
    }
    public void calArea(){
        area = length * breath;
    }
}

class Circle extends Shape{
    int radius;
    public void getAttributes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = input.nextInt();
    }
    public void calArea(){
        area = 3.14 * radius * radius;
    }
}

class Triangle extends Shape{
    int length;
    int height;
    public void getAttributes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = input.nextInt();
        System.out.println("Enter height: ");
        height = input.nextInt();
    }
    public void calArea(){
        area = 0.5 * length * height;
    }
}

public class Main
{
    static double totalarea=0;
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter número amigo: ");
		int size = input.nextInt();
		Shape[] list = new Shape[size];
		System.out.println("1. Cuadrado/Cudrada   2. rectángulo   3. circulo   4. triángulo");
		int choice;
		for (int i=0; i<size; i++){
		    System.out.println("Enter choice of shape: ");
		    choice = input.nextInt();
		    if (choice==1){
		        list[i] = new Square();
		        list[i].getAttributes();
		    }
		    else if (choice==2){
		        list[i] = new Rectangle();
		        list[i].getAttributes();
		    }
		    else if (choice==3){
		        list[i] = new Circle();
		        list[i].getAttributes();
		    }
		    else if (choice==4){
		        list[i] = new Triangle();
		        list[i].getAttributes();
		    }
		    System.out.println();
		}
		System.out.println("Enter 1 to calculate area: ");
		choice = input.nextInt();
		if (choice==1){
		    for (int i=0; i<size; i++){
		        list[i].calArea();
		        totalarea = totalarea + list[i].getArea();
		    }
		    System.out.println("Total area is: "+totalarea);
		}
	}
}








}