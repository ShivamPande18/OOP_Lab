import java.util.Scanner;

public class BitwiseVals {
    public static void main(String[] args) {
        int a,b; 

        System.out.println("Enter 2 numbers\n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.println( (a << 2) + (b >> 2));
        System.out.println( b > 0 );
        System.out.println( (a + b * 100) / 10);
        System.out.println( a & b);
    }
}
