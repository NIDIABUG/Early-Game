package src;
import java.util.Scanner;
//import java.util.*;

// Hypotenuses Finder in Command Line Interface
public class Hypotenuse
 {
   public static void main(String args[])
   { 
   
   double a;
   double b;
   double c;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Opposite/A = ");
    a = scan.nextDouble();
    System.out.print("Adjacent/B = ");
    b = scan.nextDouble();
    
    c = Math.sqrt((a*a)+(b*b));
    
    System.out.println("Hypotenuse/C = "+c);
    
   }
 }
