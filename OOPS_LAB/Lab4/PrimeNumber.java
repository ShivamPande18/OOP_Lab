import java.util.Scanner;

public class PrimeNumber {
    boolean isPrime(int n){
        if(n<=1) return false;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        
        for (int i = 0; i < n; i++) {
            
            if(p.isPrime(arr[i])) System.out.print(arr[i] + " ");
        }
        
        sc.close();

    }
}
