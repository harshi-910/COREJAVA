package loops;

import java.util.Scanner;

public class UpperAndLowerCase 
{
    public static void main(String[] args) {
   
    String str;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    System.out.println("Lower case letters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print(ch + " ");  
            }
        }

    System.out.println("\nUpper case letters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print(ch + " ");  
            }
        }
        sc.close();
}
}
