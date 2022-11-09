import java.util.Scanner;
public class Shape2DApp {
    
    public static class Shape{
       
        double area;
        public void getDimensions(){}
        public void calArea(){}
        public double getArea(){
            return area;
        }
    }

    class Square extends Shape{
        int length;
        public void getDimensions(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length");
            length = sc.nextInt();
        }

        public void calArea(){
            area = length*length;
        }
    }

    class Rectangle extends Shape{
        int length;
        int breadth;
        public void getDimensions(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
            length = sc.nextInt();
            System.out.println("Enter breath: ");
            breadth = sc.nextInt();
        }
        public void calArea(){
            area = length * breadth;
        }
    }

    class Circle extends Shape{
        int radius;
        public void getDimensions(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius: ");
            radius = sc.nextInt();
        }
        public void calArea(){
            area = 3.14 * radius * radius;
        }
    }

    class Triangle extends Shape{
        int length;
        int height;
        public void getDimensions(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
            length = sc.nextInt();
            System.out.println("Enter height: ");
            height = sc.nextInt();
        }
        public void calArea(){
            area = 0.5 * length * height;
        }
    }

    public static void main(String[] Args){
        double totalarea = 0;
        int numberShapes;
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of shapes:");
        numberShapes = sc.nextInt();

        Shape[] list = new Shape[numberShapes];

        for(int i = 0 ; i<numberShapes; i++){
            System.out.println("Choose the shape.");
            System.out.println("Enter 1 for Square \n 2 for Rectangle \n 3 for Circle \n 4 for Triangle");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    list[i] = new Square();
                    list[i].getDimensions();
                    break;

                case 2:
                    list[i] = new Rectangle();
                    list[i].getDimensions();
                    break;
                
                case 3:
                    list[i] = new Circle();
                    list[i].getDimensions();
                    break;

                case 4:
                    list[i] = new Triangle();
                    list[i].getDimensions();
                    break;
            }
        }

        System.out.println("Enter 1 to calculate area: ");
		choice = sc.nextInt();
		if (choice==1){
		    for (int i=0; i<numberShapes; i++){
		        list[i].calArea();
		        totalarea = totalarea + list[i].getArea();
		    }
		    System.out.println("Total area is: "+totalarea);
		}
    }

  
}
