
/**
 * Write a description of class CruiseShip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassengerPlane extends Airplane
{
    private int numPassengers;
    private static int numPassengerPlane = 0;
    
    public PassengerPlane(){
    
        numPassengerPlane++;
    }
    
    public PassengerPlane(String name, String model, int range, int numPassengers){
        super(name, model, range);
        setPassengers(numPassengers);
        numPassengerPlane++;
    }
    
    public void setPassengers(int passengers){
        this.numPassengers = passengers;
    }
    
    public int getNumPassengers(){
        return numPassengers;
    }
    
    public static int getPassengerPlane(){
        return numPassengerPlane;
    }
    
    @Override 
    public String toString(){
        String str = String.format("%s Number Of Passengers: %d",super.toString(), numPassengers);
        return str;
    }
}
