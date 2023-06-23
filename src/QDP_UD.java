package src;
import java.util.Scanner;
//import java.util.*;

// Quartile, Decile, and Percentile of Ungrouped Data Calculator in Command Line Interface
public class QDP_UD
{
    public static void main(String[] args){
        double Opr;
        double n;
        double i;
        double Ans;
                
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Operation = ");
        Opr = scan.nextDouble();
        
        System.out.print("n = ");
        n = scan.nextDouble();
        
        System.out.print("i = ");
        i = scan.nextDouble();
        
        
        Ans = (((n + 1) * i) / Opr);
        System.out.print("Answere = "+Ans);
       
      }
  }
