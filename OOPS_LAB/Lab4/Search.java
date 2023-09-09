import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int n,src;
        int cnt=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search term");
        src = sc.nextInt();
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
            if(temp==src) cnt++;
        }

        System.out.println(src + " occured " + cnt + " times");
        
        sc.close();

    }
}
