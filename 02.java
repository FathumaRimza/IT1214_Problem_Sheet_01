class Vehicle{
	private String licensePlate;
    private	String ownerName;
    private	int hoursParked;
	
	
	public Vehicle(String licensePlate,String ownerName,int hoursParked){
		this.licensePlate= licensePlate;
	  this.ownerName=ownerName;
	  this.hoursParked=hoursParked;
	}
	
	public String getLicensePlate(){
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate){
	this.licensePlate=licensePlate;
	}

public String getOwnerName(){
		return ownerName;
	}
	
	public void setOwnerName(String ownerName){
	this.ownerName=ownerName;
	}

public int getHoursParked(){
		return  hoursParked;
	}
	
	public void setHoursParked(int  hoursParked){
	this.hoursParked= hoursParked;
	}
 public void display() {
        System.out.println("License Plate: " + licensePlate +" Owner:" + ownerName + "   Hours Parked: " + hoursParked);
                           
                           
    }	
}


class ParkingLot{
	 private Vehicle[] vehicles=new Vehicle[5];
    private int count=0;

     public void parkVehicle(Vehicle v) {
        if (count < 5) {
            vehicles[count] = v;
            count++;
            System.out.println("Vehicle parked: " + v.getLicensePlate());
        } else {
            System.out.println("Parking lot is full!");
        }
    }
	public void removeVehicle(String licensePlate) {
    for (int i = 0; i < count; i++) {
        if (vehicles[i].getLicensePlate().equalsIgnoreCase(licensePlate)) {
          
            for (int j = i; j < count - 1; j++) {
                vehicles[j] = vehicles[j + 1];
            }
            vehicles[count - 1] = null; 
            count--; 
            System.out.println("Vehicle with license plate " + licensePlate + " removed.");
            return; 
        }
    }
    System.out.println("Vehicle with license plate " + licensePlate + " not found.");
}

public void displayVehicles() {
    if (count == 0) {
        System.out.println("No vehicles parked.");
    } else {
        System.out.println("Parked Vehicles:");
        for (int i = 0; i < count; i++) {
            vehicles[i].display();
        }
    }
}
}
class Main {
    public static void main(String[] args) {
        ParkingLot P= new ParkingLot();

      
        P.parkVehicle(new Vehicle("ABC123", "JohnDoe", 2));
        P.parkVehicle(new Vehicle("XYZ789", "JaneSmith", 4));
        P.parkVehicle(new Vehicle("LMN456", "BobBrown", 1));

     
        P.removeVehicle("XYZ789");

      
        P.displayVehicles();
    }
}

    

	
	
	
