
class Car { 

     String carColor; 
     String carBrand; 
     String fuelType; 
double mileage; 
  
public Car(String carColor, String carBrand, String fuelType, double mileage) { 
	this.carColor = carColor; 
	this.carBrand carBrand; 
	this.fuelType = fuelType; 
	this.mileage = mileage; 
} 
public void start() { 
System.out.println(carBrand + is starting."); 
} 

public void stop() { 
System.out.println(carBrand + " is stopping."); 
} 
 
public void service() { 
System.out.println(carBrand + " is being serviced."); 
} 
}
public class Main { 
public static void main(String[] args) { 

	Car car1 = new Car("Red", "Toyota", "Petrol", 15.0); 
	Car car2 = new Car("Blue", "Honda", "Diesel", 20.0); 
	Car car3 = new Car ("Black", "Ford", "Electric", 100.0); 

	car1.start(); 
	car1.service(); 
	car1.stop(); 
System.out.println(); 

	car2.start(); 
	car2.service(); 
	car2.stop(); 
System.out.println(); 

	car3.start(); 
	car3.service(); 
	car3.stop(); 
System.out.println("Bhavagnya"); 
}