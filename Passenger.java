public class Passenger extends Ship {
    private String passengerName; // private attributes
    private String passengerCruise;
    private String passengerCabin;

    public Passenger(){ // default constructor
    }

    public Passenger(String passengerName, String passengerCruise, // constructor
    String passengerCabin){
        super();
        this.passengerName = passengerName;
        this.passengerCruise = passengerCruise;
        this.passengerCabin = passengerCabin;
    }
// MUTTATORS
    public String getPassengerName(){ //getter
        return passengerName;
    }
    public String getPassengerCruise(){
        return passengerCruise;
    }
    public String getPassengerCabin(){
        return passengerCabin;
    }

    public void setPassengerName(String passengerName){ // setter
        this.passengerName = passengerName;
    }
    public void setPassengerCruise(String passengerCruise){ // setter
        this.passengerCruise = passengerCruise;
    }
    public void setPassengerCabin(String passengerCabin){ // setter
        this.passengerCabin = passengerCabin;
    }
    public void printPassengerDetails(){
        System.out.println();
    }

    @Override
    public String toString(){ // tostring function
        return "Passenger [Name = " + passengerName + ", Cruise = " + passengerCruise + ", Cabin = " + passengerCabin + "]";
    }



    
}
