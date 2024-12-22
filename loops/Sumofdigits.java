package loops;

import java.util.Scanner;

public class Sumofdigits
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value : ");
        n=sc.nextInt();
        int sum=0;
        // while(n>0)                            // using while loop
        // {
        //     int digit=n%10;
        //     sum=sum+digit;
        //     n=n/10;
        // }

        int digitcount = 0;                      // using for loop by counting no.of digits of n initially
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digitcount++;
        }
        System.out.println("Digit count : "+digitcount);
        
        for(int i=0;i<digitcount;i++)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("Sum of digits of n : "+sum);
        sc.close();
        
    }
    
}
