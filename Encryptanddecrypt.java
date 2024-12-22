import java.util.Scanner;

public class Encryptanddecrypt 
{
    public static void main(String[] args)
    {
        // String str="how are you";                 //direct input
        
        // String encryptedmsg="";
        // for(int i=0;i<str.length();i++)
        // {
        //     char ch=str.charAt(i);
        //     if(ch>='a' && ch<='z')
        //     {
        //         ch=(char)(ch+1);
        //         if(ch>'z')
        //         {
        //             ch='a';
        //         }
        //     }
        //     encryptedmsg+=ch;
            
        // }
        // System.out.println("Encrypted message: " + encryptedmsg);


        String str;                                   //scanning input
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String encryptedmsg="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch=(char)(ch+1);
                if(ch>'z')
                {
                    ch='a';
                }
            }
            encryptedmsg+=ch;
            
        }
        System.out.println("Encrypted message: " + encryptedmsg);
        sc.close();

    }
}
