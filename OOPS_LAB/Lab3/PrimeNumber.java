import java.util.Scanner;

public class PrimeNumber {

    int isPrime(int n)
    {
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        int low,high; 

        System.out.println("Enter low and high range\n");
        Scanner sc = new Scanner(System.in);
        low = sc.nextInt();
        high = sc.nextInt();
        sc.close();

        for (int i = low; i <= high; i++) {
            if(i==1) continue;
            if(pn.isPrime(i)==1) System.out.print(i + " ");
        }
    }
}
