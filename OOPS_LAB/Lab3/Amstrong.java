import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int num,temp,res=0; 

        System.out.println("Enter a number\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        temp = num;

        while(num!=0)
        {
            res+= Math.pow(num%10, 3);
            num /= 10;
        }

        if(res == temp) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
        // Math.pow(0, 0);
    }    
}