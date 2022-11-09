package lab3;

public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12]; // array of 12 seat objects
    private int numEmptySeat = 12; // instance containing information on number of empty seats

    public Plane(){ // constructor class
        for(int i=0; i<12; i++){
            seat[i] = new PlaneSeat(i+1);
        }
    } 

    private PlaneSeat[] sortSeats(){ 
        // sort ascendingly by customerID
        // Create a clone of the array 
        PlaneSeat[] temp = new PlaneSeat[12];
        int temp_id;
        for(int i=0; i<12; i++){
            temp[i] = new PlaneSeat(i+1);
            if (seat[i].isOccupied()){
                temp_id = seat[i].getCustomerID();
                temp[i].assign(temp_id);
            }
        }

        PlaneSeat holder = new PlaneSeat(0);
        for(int i=0; i<12; i++){
            for(int j=i; j>0; j--){
                if(temp[j].getCustomerID() < temp[j-1].getCustomerID())
                {
                    holder = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = holder;
                }
            }
        }
        return temp;


    }

    public void showNumEmptySeats(){ // display number of empty seats
        int emptySeatCount = 0;

        for(int i=0; i<12 ; i++){
            if(seat[i].isOccupied() == false){
                emptySeatCount ++;
            }
        }

        System.out.println("Empty seat count: " + emptySeatCount);
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty");
                    for(int i = 0; i<12; i++){
                        if(seat[i].isOccupied() == false){
                            System.out.println("SeatID: "+ (i+1));
                        }
                    }
    }

    public void showAssignedSeats(boolean bySeatId){
        if(bySeatId){ // non -sorted array
            System.out.println("The seat assignments are as follow: ");
            for(int i=0; i<12; i++){
                if(seat[i].isOccupied() == true){
                    System.out.println("SeatID" + seat[i].getSeatID() + "is assigned to CustomerID" + seat[i].getCustomerID());
                }
            }
        }
        else{ // sorted array , print on order of CustID
            PlaneSeat temp[] = sortSeats();
            System.out.println("The seat assignments are as follow: ");
            for(int i=0; i<12; i++){
                if(temp[i].isOccupied() == true){
                    System.out.println("SeatID" + temp[i].getSeatID() + "is assigned to CustomerID" + temp[i].getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){
        if(numEmptySeat == 0){
            System.out.println("There is no more available seats!");
            return;
        }

        if(seat[seatId-1].isOccupied() == true){
            System.out.println("The seat is already assigned to a customer.");
            return;
        }
        seat[seatId-1].assign(cust_id);
        System.out.println("Seat assigned!");
        numEmptySeat--;
    }

    public void unAssignSeat(int seatId){
        if(numEmptySeat == 12){
            System.out.println("There are no seats to unassign, the plane is empty!");
            return;
        }
        seat[seatId-1].unAssign();
        System.out.println("Seat Unassigned!");
        numEmptySeat++;
    }



}
