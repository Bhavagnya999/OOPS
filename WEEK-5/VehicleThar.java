class Vehicle{
    void displayInfo(){
        System.out.println("Thar is a vehicle");
    }
}
class Car extends Vehicle{
    void displayInfo(){
    System.out.println("Thar has five doors");
    }
}
public class VehicleThar{
    public static void main(String[]args){
    Vehicle myvehicle=new Vehicle();
    myvehicle.displayInfo();
    Car myCar=new Car();
    myCar.displayInfo();
}
}