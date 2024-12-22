package loops;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        
        
        int temp = n;
        int digitCount = 0;
        for (int i = 0; temp > 0; i++) {
            temp = temp / 10;  
            digitCount = i + 1; 
        }
        
        System.out.println("No. of digits: " + digitCount);
        
        System.out.print("Reversed number: ");
        for (int i = 0; n > 0; i++) {
            int digit = n % 10;  
            System.out.print(digit);  
            n = n / 10;  
        }
        
        sc.close();
    }
}
