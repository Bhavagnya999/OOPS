public class Myclass {
    // Class attributes
    int count;
    final double pi = 3.14;

    // Constructor
    public Myclass() {
        count++; // Increment count each time an object is created
    }

    // Main method
    public static void main(String[] args) {
        Myclass obj1 = new Myclass(); // Create the first object
        Myclass obj2 = new Myclass(); // Create the second object
        Myclass obj3 = new Myclass(); // Create the third object

        // Print final values of count and pi for each object
        System.out.println("Object 1 - Count: " + obj1.count + ", Pi: " + obj1.pi);
        System.out.println("Object 2 - Count: " + obj2.count + ", Pi: " + obj2.pi);
        System.out.println("Object 3 - Count: " + obj3.count + ", Pi: " + obj3.pi);
    }
}
