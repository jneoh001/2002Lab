package lab3;
import java.util.Scanner;

public class PlaneApp{
    /* 
The class PlaneApp should be able to support the following:
(1) Show the number of empty seats
(2) Show the list of empty seats
(3) Show the list of customers together with their seat numbers in the order of the seat numbers
(4) Show the list of customers together with their seat numbers in the order of the customer ID
(5) Assigna customer to a seat
(6) Remove a seat assignment */

    public static void main (String[] Args){
        System.out.println("(1) Show the number of empty seats ");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of customers together with their seat numbers in order of seat numbers  ");
        System.out.println("(4) Show the list of customers together with their seat numbers ");
        System.out.println("(5) Assign a custonmer to seat");
        System.out.println("(6) Remove a seat assignment ");

        int choice;
        Scanner sc = new Scanner(System.in);
        Plane myPlane = new Plane();

        do{
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    myPlane.showNumEmptySeats();
                    break;
                case 2:
                    myPlane.showEmptySeats();
                    break;
                case 3: // show seat assignments by seat id 
                    myPlane.showAssignedSeats(true);
                    break;

                case 4: // show seat assignments by customer ID
                    myPlane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning seat...");
                    System.out.println("Please enter SeatID: ");
                    int assignSeatID = sc.nextInt();
                    System.out.println("Please enter CustomerID: ");
                    int assignCustomerID = sc.nextInt();
                    myPlane.assignSeat(assignSeatID, assignCustomerID);
                    break;

                case 6:
                    System.out.println("Enter seatID to unassign customer from ");
                    int unassignSeatID = sc.nextInt();
                    myPlane.unAssignSeat(unassignSeatID);
                    break;
            }
        }while((choice < 7));
    }
}