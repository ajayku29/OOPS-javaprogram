//Avg of number
import java.util.Scanner;
class Avg 
     {
          public static void main(String arg[])
           {
              Scanner s= new Scanner(System.in); 
            System.out.println("Enter the numbers for Avg: ");
            double a=s.nextDouble();
           double b= s.nextDouble();
            double c= s.nextDouble();
//Operation logic
             double Avg=(a+b+c)/3;
          System.out.println("Avg of three numbers: " +Avg);
           }
     }