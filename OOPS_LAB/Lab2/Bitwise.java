import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int num;
        boolean a = true;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        System.out.println("Bitwise Double: " + (num << 1));
        System.out.println("Bitwise Half: " + (num >> 1));

        sc.close();
    }
}
