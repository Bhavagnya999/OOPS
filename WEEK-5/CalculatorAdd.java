class Calculator{
    public int add(int p,int q){
        return p+q;
    }
    public double add(double p,double q){
        return p+q;
    }
    public int add(int p,int q,int r){
        return p+q+r;
    }
}
public class CalculatorAdd{
    public static void main(String[] args){
        Calculator calculator=new calculator();
        System.out.println("Sum of 3 and 9:"+calculator.add(3,9));
        System.out.println("Sum of 3.9 and 9.9:"+calculator.add(3.9,9.9));
        System.out.println("Sum of 1,3 and 9:"+calculator.add(1,3,9));
    }
}