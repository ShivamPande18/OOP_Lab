import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {

        int num,temp,rev=0; 

        System.out.println("Enter a number\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        temp=num;

        while(temp!=0)
        {
            rev *= 10;
            rev += temp%10;
            temp = temp/10;
        }

        if(num == rev) System.out.println("Pallindrom");
        else System.out.println("Not Pallindrome");

    }
}