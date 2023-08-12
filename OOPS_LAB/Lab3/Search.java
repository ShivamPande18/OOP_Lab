import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        
        int a[]={1,2,3,1,2,1,5,6,7};
        int src; 

        System.out.println("Enter value to search\n");
        Scanner sc = new Scanner(System.in);
        src = sc.nextInt();
        sc.close();

        System.out.println("Value found at location:");
        int i=0;
        for (int val : a) {
            if(val == src) System.out.print("a[" + i + "] ");
            i++;
        }

    }
}
