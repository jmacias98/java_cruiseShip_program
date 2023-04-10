public class Cruise extends Ship  {
    private String cruiseName; //ok
    private String toDestination;
    private String fromDestination;

    public Cruise(){ // default constructor

    }
    public Cruise(String cruiseName, String toDestination,
    String fromDestination){ // constructor
        this.cruiseName = cruiseName;
        this.toDestination = toDestination;
        this.fromDestination = fromDestination;
    }

    // MUTATORS

    public String getCruiseName(){  // getter
        return cruiseName;
    }

    public void setCruiseName(String cruiseName){
        this.cruiseName = cruiseName;
    }
    public String getToDestination(){
        return toDestination;
    }

    public void setToDestination(String toDestination){ // setter
        this.toDestination = toDestination;
    }
    public String getFromDestination(){
        return fromDestination;
    }

    public void setFromDestination(String fromDestination){
        this.fromDestination = fromDestination;
    }
    public String printCruiseDetails(){
        return "Cruise [Cruise Name = " + cruiseName + ", Ship Name = "+ getShipName() +  ", To = "+ toDestination+ ", From = "+ fromDestination + "]";
    }
  
    @Override // tostring fuctions
    public String toString(){
        return "Cruise [Cruise Name = " + cruiseName + ", Ship Name = "+ getShipName() + "]";
    }
}
