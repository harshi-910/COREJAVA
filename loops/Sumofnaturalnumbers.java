package loops;

import java.util.Scanner;

public class Sumofnaturalnumbers 
{
    public static void main(String[] args) 
    {

        // int n;                                                               // scanning value
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter n value: ");
        // n=sc.nextInt();
        // int sum=0;
        // for(int i=0;i<=n;i++)
        // {
        //     sum=sum+i;
        // }
        // System.out.println("Sum of natural numbers is: "+sum);


        // int arr[]={1,2,3,4,5};                                                // using array
        // int sum=0;
        // for(int i=0;i<=arr.length;i++)
        // {
        //     sum=sum+i;

        // }
        // System.out.println("Sum of natural numbers is: "+sum);


                                                                                // using while loop
        int n,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        n=sc.nextInt();
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of natural numbers is: "+sum);
        sc.close();

    }
    
}
