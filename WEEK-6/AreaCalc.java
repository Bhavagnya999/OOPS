class Shape{  
  int calcArea(int a){
    return a*a;
  }
  int calcArea(int b, int h){
    return b*h;
  }
}
class Circle extends Shape{
  double r;
  double pi = 3.141592653589793;  
  Circle(double r){
    this.r = r;
  }  
  double calcArea(double r){
    return pi*r*r; 
  }
}
public class AreaCalc {
    public static void main(String[] args) {     
      Circle c = new Circle(7);
      System.out.println("The area of circle is " + c.calcArea(9.9));
      System.out.println("The area of Rectangle is " + c.calcArea(3, 9));
      System.out.println("The area of Square is " + c.calcArea(9));
      System.out.println("Bhavagnya");
  }
}
