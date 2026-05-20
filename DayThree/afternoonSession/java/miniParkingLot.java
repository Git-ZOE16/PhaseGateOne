import java.util.Scanner;

public class miniParkingLot{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

 int[] parkingLot = new int[20];
 int choice;
 
 
 while (true);
    System.out.println("\n==== MINI PARKING LOT ====");
    System.out.println("1. Park a car");
    System.out.println("2. Remove a car");
    System.out.println("3. Display parking Status");
    System.out.println("4. Exit");
    System.out.println("5. Make your Choice");
    
 user_input = input.nextInt();
 
 switch (user_input){
    case 1:
    boolean parked = false;
    for(int value = 0; value < parking.length; value++){
        if(parking[value] == 0){
            parking[value] == 1;
    System.out.println("car parked at slot" + (value + 1));
    parked = true;
        break;
        }
     }
 if(parked){
System.out.println("No space in parking lot!");
 }
 
 
case 2:
System.out.println("Enter a slot number to remove car (1-20):");
int slot = input.nextInt();
    if(slot >= 1 && slot <= 20) {
        parking[slot -1] == 1;
        parking[slot -1] == 0;
  System.out.println("car remove from slot" + slot);
  } else {
 System.out.println("Slot is Full");
 }else{
 System.out.println("Invalid Slot number");
     break;
 }
 
 
case 3:

 displayStatus(parking);
 
 
 
 }
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 

    for(int count = 0; count < parkingLot.length; count++){
    
    if(parkingLot[count] == 0){
    
    
    }
    System.out.print()


}

}



}
