package parking.tiket.simulator;

/**
 *
 * @author Elroy McNealy
 */
public class ParkingTiketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {    
     ParkedCar car = new ParkedCar("Volkswagen","1972", "Red", "147RHZM", 125);
     ParkingMeter meter = new ParkingMeter(60);
     PoliceOfficer officer = new PoliceOfficer("Joe", "Friday", "4778");     
     ParkingTicket ticket = officer.patrol(car, meter);
     if (ticket != null)
         System.out.println(ticket);
     else
         System.err.println("No crimes committed!");    
    }
}

class ParkedCar {
    String make;
    String model;
    String color;
    String licenseNumber;
    int minutesParked;
    
    ParkedCar (String mk, String mod, String col, String lic, int min){
        mk = make;
        mod = model;
        col = color;
        lic = licenseNumber;
        min = minutesParked;
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
    void setMake(String mk){
        make = mk;
    }
    void setModel(String mod){
        model = mod;
    }
    void setColor (String col){
        color = col;
    }
    void setLicenseNumber (String Lic){
        licenseNumber = Lic;
    }
    void setMinutesParked (int min){
        minutesParked = min;
    }
}

class PoliceOfficer {
    String fName;
    String lName;
    String badgeNumber;
    
    PoliceOfficer (String newfName,String newlName, String newbadgeNumber){
        newfName = fName;
        newlName = lName;
        newbadgeNumber = badgeNumber;
    }
    patrol(ParkedCar car, ParkingMeter meter){
        ParkingTicket;

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
    void setFName (String fnam){
        fName = fnam;
    }
    void setLName (String lnam){
        lName = lnam;
    }
    void setBadgeNumber (String badge){
        badgeNumber = badge;
    }
}

class ParkingMeter {
    int minutesPurchased;
    
    ParkingMeter (int m){
        m = minutesPurchased;
    }
    void setMinutesPurchased(int m){
        minutesPurchased = m;
    }
    int getMinutesPurchased(){
        return minutesPurchased;
    }   
}

class ParkingTicket {
    ParkedCar car;
    PoliceOfficer officer;
    double fine;
    int Minutes;
    double Base_Fine = 25.0;
    double Hourly_Fine = 10.0;
    
    ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min){
            aCar = car;
            anOfficer = officer;
            min = Minutes;
    }
    void calculateFine(){
        
    }

}