//Arithmetic, Logical, Relational Operators
package calculations;
import java.util.*;
public class Calc 
{

    //Arithmetic Operations

    public static int add(int a,int b)
        {
            return a+b;
        }
        public static int sub(int a,int b)
        {
            return a-b;
        }
        public static int mul(int a,int b)
        {
            return a*b;
        }
        public static int div(int a,int b)
        {
            return a/b;
        }
    
        public static void main(String[] args)
         {
             int a,b;
              a=5;
              b=5;
            //  int sum = a+b;                                                  //inside main method
            // int sub = a-b;
            // int mul = a*b;
            // int div = a/b;
            //double power=Math.pow(a, b);
            
            // System.out.println("Sum of "+a+ " & " +b+" is " +sum); 
            // System.out.println("Sub of "+a+ " & " +b+" is " +sub);
            // System.out.println("Mul of "+a+ " & " +b+" is " +mul);
            // System.out.println("Div of "+a+ " & " +b+" is " +div);
            //System.out.println("Power of "+a+ " & " +b+" is " +power);
    
            // int sum = add(5,5);                                              //giving values direclty
            // int sub = sub(5,5);
            // int mul = mul(5,5);
            // int div = div(5,5);
            // System.out.println("Sum of 5 & 5 is "+sum); 
            // System.out.println("Sub of 5 & 5 is "+sub); 
            // System.out.println("Mul of 5 & 5 is "+mul); 
            // System.out.println("Div of 5 & 5 is "+div); 

            int sum = add(a,b);                                                //calling method
            int sub=sub(a,b);
            int mul=mul(a,b);
            int div=div(a,b);

            System.out.println("Sum of "+a+ " & " +b+" is " +sum); 
            System.out.println("Sub of "+a+ " & " +b+" is " +sub);
            System.out.println("Mul of "+a+ " & " +b+" is " +mul);
            System.out.println("Div of "+a+ " & " +b+" is " +div);
      
    }
}
    

