import java.util.Scanner;
/**
 * Write a description of class testAirplane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testAirplane
{
    public static void main(String [] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        Airplane [] arrAirplanes = new Airplane[15];
        arrAirplanes = fillArray(arrAirplanes);
        display(arrAirplanes);
        
       
        
        
    }
    
    public static void display(Airplane [] arrAirplanes){
        int size = PassengerPlane.getPassengerPlane() + CargoPlane.getNumCargoPlane();
        
        for(int i = 0; i < size; i++){
            System.out.printf("%d %s\n", i+1, arrAirplanes[i].toString());
            
        }
    }
    
    public static Airplane [] fillArray(Airplane [] arrAirplanes){
        Scanner sc = new Scanner(System.in);
        int choice;
        String name; 
        String model; 
        int range; 
        int maxPayload;
        int numPassengers; 
        int counter = 0; 
        
        System.out.print("PassengerPlane[1] | CargoPlane[2] | Exit[0]: ");
        choice = sc.nextInt();
        
        
        while(counter < 15 && choice != 0){
            System.out.printf("Name of the Airplane: ");
            name = sc.next();
            System.out.print("Name of the model: ");
            model = sc.next();
            System.out.print("Range: ");
            range = sc.nextInt();
            
            if(choice == 1){
                System.out.print("Enter the number of passengers: ");
                numPassengers = sc.nextInt();
                
                arrAirplanes[counter] = new PassengerPlane(name, model, range, numPassengers);
                counter++;
            }
            else if(choice == 2){
                System.out.print("Enter cargo capacity: ");
                maxPayload = sc.nextInt();
                
                arrAirplanes[counter] = new CargoPlane(name, model, range, maxPayload);
                counter++;
            }
            else{
                System.out.println("Incorrect input, please try again.");
            }
            
            System.out.print("Passenger[1] | CargoPlane[2] | Exit[0]: ");
            choice = sc.nextInt();
        }
        
        
        
        
        
        return arrAirplanes;
    }
    
    
}
