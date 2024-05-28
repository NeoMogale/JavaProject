
/**
 * Write a description of class Ship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Airplane
{
    private String name;
    private String model;
    private int range;
    
    
    public Airplane(){}
    
    public Airplane(String name, String model, int range){
        this.name = name;
        this.model = model;
        this.range = range;
    }
    
    public String getName(){
        return name;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getRange(){
        return range;
    }
    
    @Override 
    public String toString(){
        String str = String.format("%s %s %d", name.toUpperCase(), model.toUpperCase(), range);
        return str;
    }
}
