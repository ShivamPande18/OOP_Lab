import java.util.Scanner;

class NumberPattern
{
    public static void main(String[] args) {
        int dim;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention:");
        dim = sc.nextInt();
        sc.close();

        int cnt = 1;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}
