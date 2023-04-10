public class Ship {
    private String shipName;// private attributes
    private int cabinBalcony;
    private int cabinOceanView;
    private int cabinSuite;
    private int cabinInterior;
    private boolean inService;

    public Ship(){ // default constructor
        
    }
    public Ship(String shipName, int cabinBalcony, int cabinOceanView, // constructor
    int cabinSuite, int cabinInterior, boolean inService){
        this.shipName = shipName;
        this.cabinBalcony = cabinBalcony;
        this.cabinOceanView = cabinOceanView;
        this.cabinSuite = cabinSuite;
        this.cabinInterior = cabinInterior;
        this.inService = inService;
    }
    // MUTATORS
    //getters
    public String getShipName(){
        return shipName;
    }
    public int getCabinBalcony(){
        return cabinBalcony;
    }
    public int getCabinOceanView(){
        return cabinOceanView;
    }
    public int getCabinSuite(){
        return cabinSuite;
    }
    public int getCabinInterior(){
        return cabinInterior;
    }
    public boolean getInService(){
        return inService;
    }
    //setters

    public void setShipName(String shipName){
        this.shipName = shipName;
    }
    public void setCabinBalcony(int cabinBalcony){
        this.cabinBalcony = cabinBalcony;
    }
    public void setCabinOceanView(int cabinOceanView){
        this.cabinOceanView = cabinOceanView;
    }
    public void setCabinSuite(int cabinSuite){
        this.cabinSuite = cabinSuite;
    }
    public void setCabinInterior(int cabinInterior){
        this.cabinInterior = cabinInterior;
    }
    public void setInService(Boolean inService){
        this.inService = inService;
    }
    // toString functions returns results
    @Override
    public String toString(){
        return "Ship [Ship Name = " + shipName + ", Passengers on Balcony = " + cabinBalcony
        + ", Passengers on Ocean View = " + cabinOceanView + ", Passengers on Suite = " 
        + cabinSuite +", Passengers on Interior = " + cabinInterior +", In Service = "+ inService +"]";
    }
    
}
