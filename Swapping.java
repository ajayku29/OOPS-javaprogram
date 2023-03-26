//Swapping Operation with Local Variable
class Swapping
{
   public static void main(String arg[])
   {
   // Using Local variable
      int a=12, b=15, c;
     //Before Swapping
      System.out.println("Before Swapping : a= "+ a +" b= "+b);
       //Logic
         c=a;
         a=b;
         b=c;
    // After Swapping 
      System.out.println("After Swapping :a= "+a+" b= "+b);
    }
 }