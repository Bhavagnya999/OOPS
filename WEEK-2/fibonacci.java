import java.util.Scanner;
public class fibonacci {
       public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int a=0; int c=1;
       System.out.println("Fibonacci: "+a);
       int next=a+c;
       a=c;
       c=next;
    }
   }
