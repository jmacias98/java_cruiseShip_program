// Jesus Macias
//CPSC245
// Dr. Sam
// Project Final
// This program provides a text based menu, and from there,
// the user is able to select options from adding ships, cruises, etc.
// And then editing those created objects and printing them as well.

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    static String choice;
    static String listType;
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // array lists initialize
        ArrayList<Object> shipFullList = new ArrayList<Object>();
        ArrayList<Object> cruiseList = new ArrayList<Object>();
        ArrayList<Object> cruiseDetailsList = new ArrayList<Object>();
        ArrayList<Object> passengerList = new ArrayList<Object>();
        ArrayList<Object> shipInServiceList = new ArrayList<Object>();
        ArrayList<Object> shipNamesList = new ArrayList<Object>();


        Ship shipEntry = new Ship(); // initialize object
        Passenger passengerEntry = new Passenger();
        Cruise cruiseEntry = new Cruise();

        Scanner scanner = new Scanner(System.in);

        loop : while (true) // loop for menu
        {
            // Menu
            System.out.println("\t LUXURY VACATION CRUISE\n\t SYSTEM MENU");
            System.out.println("[1] Add Ship\t\t[A] Print Ship Names");
            System.out.println("[2] Edit Ship\t\t [B] Print Ship In Service List");
            System.out.println("[3] Add Cruise\t\t [C] Print Ship Full List");
            System.out.println("[4] Edit Cruise\t\t [D] Print Cruise List");
            System.out.println("[5] Add Passenger\t [E] Print Cruise Details");
            System.out.println("[6] Edit Passenger\t [F] Print Passenger List");
            System.out.println("[x] Exit System");
            System.out.print("\nMake a Menu Selection: ");

            choice = scanner.next();
            switch(choice) // user selectio switch
            {
                case "1": // add ship
                    System.out.print("Enter Ship Name: ");
                    shipEntry.setShipName(scanner.next());
                    System.out.print("Balcony: ");
                    shipEntry.setCabinBalcony(scanner.nextInt());
                    System.out.print("Ocean View: ");
                    shipEntry.setCabinOceanView(scanner.nextInt());
                    System.out.print("Room Suite: ");
                    shipEntry.setCabinSuite(scanner.nextInt());
                    System.out.print("Room Interior: ");
                    shipEntry.setCabinInterior(scanner.nextInt());
                    System.out.print("In Service: ");
                    shipEntry.setInService(scanner.nextBoolean());

                    if (shipEntry.getInService() != false){ // add only if not false
                        shipInServiceList.add(shipEntry.getShipName());

                    }
                    shipNamesList.add(shipEntry.getShipName());
                    shipFullList.add(shipEntry.toString());
                    System.out.println("Ship Data Added.\n");
                    break;

                case "2": // Edit Ship
                    System.out.println("[2] EDIT SHIP");
                    for (Object ship : shipFullList ){
                        System.out.println(shipFullList.indexOf(ship)+" "+ship);
                    }
                    System.out.print("\nSelect Row of Data to Update: "); // update via row selection
                    int rowChoice = scanner.nextInt();
                    System.out.println("\nEnter New Data.");
                    System.out.println("Enter Ship Name: ");
                    shipEntry.setShipName(scanner.next());
                    System.out.println("Balcony: ");
                    shipEntry.setCabinBalcony(scanner.nextInt());
                    System.out.println("Ocean View: ");
                    shipEntry.setCabinOceanView(scanner.nextInt());
                    System.out.println("Room Suite: ");
                    shipEntry.setCabinSuite(scanner.nextInt());
                    System.out.println("Room Interior: ");
                    shipEntry.setCabinInterior(scanner.nextInt());
                    System.out.println("In Service: ");
                    shipEntry.setInService(scanner.nextBoolean());

                    shipFullList.set(rowChoice, shipEntry.toString());
                    System.out.println("Row "+ rowChoice + " updated.");

                    break;

                case "3": // add cruise
                    System.out.print("Enter Cruise Name: ");
                    cruiseEntry.setCruiseName(scanner.next());
                    System.out.print("Enter Cruise Ship Name: ");
                    cruiseEntry.setShipName(scanner.next());
                    System.out.print("Enter Port: ");
                    cruiseEntry.setFromDestination(scanner.next());
                    System.out.print("Enter Destination: ");
                    cruiseEntry.setToDestination(scanner.next());
                    cruiseList.add(cruiseEntry.toString());
                    cruiseDetailsList.add(cruiseEntry.printCruiseDetails());
                    break;
            
                case "4": // edit cruise 
                    System.out.println("[4] EDIT CRUISE");
                    for (Object cruise : cruiseList ){
                        System.out.println(cruiseList.indexOf(cruise)+" "+cruise);
                    }
                    System.out.print("\nSelect Row of Data to Update: ");
                    int rowChoice3 = scanner.nextInt();
                    System.out.println("\nEnter New Data.");
                    System.out.println("Enter Cruise Name: ");
                    cruiseEntry.setCruiseName(scanner.next());
                    System.out.println("Enter Cruise Ship Name: ");
                    cruiseEntry.setShipName(scanner.next());
                    cruiseList.add(cruiseEntry.toString());
                    break;

                case "5": // add passenger
                    System.out.println("Enter Passenger's Name: ");
                    passengerEntry.setPassengerName(scanner.next());
                    System.out.println("Enter Cruise Name: ");
                    passengerEntry.setPassengerCruise(scanner.next());
                    System.out.println("Enter Room Type (Balcony/Ocean/Suite/Interior): ");
                    passengerEntry.setPassengerCabin(scanner.next());
                    passengerList.add(passengerEntry.toString());
                    System.out.println("\nNew Passenger Added. ");
                    break;

                case "6": // edit passenger
                    System.out.println("[6] EDIT PASSENGER");
                    for (Object passenger : passengerList ){
                        System.out.println(passengerList.indexOf(passenger)+" "+passenger);
                    }
                    System.out.print("\nSelect Row of Data to Update: ");
                    int rowChoice2 = scanner.nextInt();
                    System.out.println("\nEnter New Data.");
                    System.out.println("Enter Passenger's Name: ");
                    passengerEntry.setPassengerName(scanner.next());
                    System.out.println("Enter Cruise Name: ");
                    passengerEntry.setPassengerCruise(scanner.next());
                    System.out.println("Enter Room Type (Balcony/Ocean/Suite/Interior): ");
                    passengerEntry.setPassengerCabin(scanner.next());
                    passengerList.add(passengerEntry.toString());
                    System.out.println("\n Passenger Updated. ");
                    break;

                case "A": // print ship names
                    if (shipFullList.size() < 1){
                        System.out.println("There are no ships at the moment."); // validation
                        return;
                    }
                    for (Object shipNames : shipNamesList){
                        System.out.println(shipNames);
                    }
                    break;

                case "B":
                    System.out.println("Ships in Service - Names");
                    for (Object shipInServiceName : shipInServiceList){
                        System.out.println(shipInServiceName);
                    } // note: can print index so only specific prints
                    break;

                case "C": // print ship full list 
                    for (Object ship : shipFullList){
                        System.out.println(ship);
                    }
                    break;

                case "D": // print cruise list
                    for (Object printCruise : cruiseList){
                        System.out.println(printCruise);
                    }
                    break;

                case "E": // print cruise details 
                    for (Object printCruiseDetails : cruiseDetailsList){
                        System.out.println(printCruiseDetails);
                    }
                    break;

                    
                case "F": // print passenger list 
                    for (Object passenger : passengerList){
                        System.out.println(passenger);
                    }
                    break;

                case "x": // exists the program 
                    scanner.close();
                    break loop;
                default:
                    System.out.println("\nERROR! Invalid Selection.");
                    break;


            }
            
        }
    }
    
}
