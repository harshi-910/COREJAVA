package loops;

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value : ");
        n=sc.nextInt();
        int n1=1;
        System.out.println(n1);
        int n2=2;
        System.out.println(n2);
        for(int i=1;i<n;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            if(n3<=n)
            {
                System.out.println(n3);
            }
          sc.close();

        }
    }
    
}
