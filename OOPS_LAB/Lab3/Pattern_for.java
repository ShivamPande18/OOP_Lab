import java.util.Scanner;

public class Pattern_for {
    public static void main(String[] args) {
        int dim; 

        System.out.println("Enter the size\n");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();
        sc.close();

        for (int i = 1; i <= dim; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        
    }
}
