/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ParkingSim;
/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
     ParkedCar car = new ParkedCar("Volkswagen", "1972",
             "Red", "147RHZM", 125);
     ParkingMeter meter = new ParkingMeter(60);
     PoliceOfficer officer = new PoliceOfficer("Joe", "Friday", "4788");
     ParkingTicket ticket = officer.patrol(car, meter);
     if (ticket != null)
         System.out.println(ticket.toStringOut());
     else
         System.out.println("No crimes committed!");    
    }
}

class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;
    
    ParkedCar (String mk, String mod, String col, String lic, int min){
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutesParked = min;
    }    
    String getMake(){
        return make;
    }
    String getModel(){
        return model;
    }
    String getcolor(){
        return color;
    }
    String getLicenseNumber(){
        return licenseNumber;
    }
    int getMin (){
        return minutesParked;
    }   
    String toStringOut(){
        String CarOut = ("Make: " + this.getMake() + "\n" + "Model: " + 
                this.getModel() + "\n" + "Color: " + 
                this.getcolor() + "\n" + "License Number: " + 
                this.getLicenseNumber() + "\n" + "Minutes Parked: " + 
                this.getMin());
        return CarOut;

    }
}

class PoliceOfficer {
    private String fName;
    private String lName;
    private String badgeNumber;
    
    PoliceOfficer (String newfName,String newlName, String newbadgeNumber){
        fName = newfName;
        lName = newlName;
        badgeNumber = newbadgeNumber;
    }
    
    ParkingTicket patrol(ParkedCar car, ParkingMeter meter){
        ParkingTicket ticket = new ParkingTicket(car, this, (car.getMin() - 
                meter.getMinutesPurchased()));
        if (car.getMin() > meter.getMinutesPurchased()){
            ticket.calculateFine();
        }            
        else {
            ticket = null;
        }
        return ticket;
    }
    
    String getfName(){
        return fName;
    }
    String getlName(){
        return lName;
    }
    String getbadgeNumber(){
        return badgeNumber;
    }    
    String toStringOut(){
        String OfficerOut = ("Name: " + this.getfName() + " " + 
                this.getlName() + "\n" + 
                "Badge Number: " + this.getbadgeNumber());
        return OfficerOut;
    }
}

class ParkingMeter {
    int minutesPurchased = 0;
    
    ParkingMeter (int m){
        minutesPurchased = m;
    }
    void setMinutesPurchased(int m){
        minutesPurchased = m;
    }
    int getMinutesPurchased(){
        return minutesPurchased;
    }   
}

class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    public double fine;
    private int Minutes;
    public double Base_Fine = 25.0;
    public double Hourly_Fine = 10.0;
    
    ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min){
        car = aCar;
        officer = anOfficer;
        Minutes = min;
    }
    
    void calculateFine(){ 
       fine = Base_Fine + Hourly_Fine *(Minutes / 60);
    }
    
    String toStringOut(){
        String TicketOut = ("Car Data: \n" + car.toStringOut() + "\n"  + 
                "Officer Data: \n" + officer.toStringOut() + 
                "\n" + "Minutes Illegally Parked: " + Minutes + "\n" + 
                "Fine: " + fine);
        return TicketOut;

    }

}
