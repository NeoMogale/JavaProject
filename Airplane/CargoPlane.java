
/**
 * Write a description of class CargoShip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CargoPlane extends Airplane
{
    private int maxPayload;
    private static int numCargoPlane;
    
    
    public CargoPlane(){
    numCargoPlane++;
    }
    
    public CargoPlane(String name, String model, int range, int maxPayload){
        super(name, model, range);
        setMaxPayload(maxPayload);
        numCargoPlane++;
    }
    
    public void setMaxPayload(int maxPayload){
        this.maxPayload = maxPayload;
    }
    
    public int getMaxPayload(){
        return maxPayload;
    }
    
    public static int getNumCargoPlane(){
        return numCargoPlane;
    }
    
    @Override 
    public String toString(){
        String str = String.format("%s CargoCapacity: %d",super.toString(), maxPayload);
        return str;
    }
}
