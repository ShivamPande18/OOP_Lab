import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            if(temp<min) min = temp;
            if(temp>max) max = temp;
        }

        System.out.println("Max: " + max + "\nMin: " + min);
        
        sc.close();

    }
}
