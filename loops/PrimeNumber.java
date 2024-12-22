package loops;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
   
    int n;                                                //prime or not
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n%2==1)
    {
        System.out.println("Prime Number");

    }
    else
    {
        System.out.println("Not prime number");
    }
    sc.close();


                                                            // print primenumbers b/w range
    // for(int i=1;i<=10;i++)
    // {
    //     if(i%2==1)
    //     {
    //         System.out.println(i);
    //     } 
    // }


}
}
