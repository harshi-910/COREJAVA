package loops;

import java.util.Scanner;

public class FactorsandSum
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value : ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            
        }
        sc.close();
    }
    
}
