package loops;

import java.util.Scanner;

public class Power 
{
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X and Y values : ");
        x=sc.nextInt();
        y=sc.nextInt();
        double power= Math.pow(x, y);
        System.out.println(power);
        sc.close();

    }
    
}
