import java.util.Scanner;

public class TypeCounter {
    public static void main(String[] args) {
        int n =10,positive=0,negative=0,zeros=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers");

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();

            if(temp>0) positive++;
            else if(temp<0) negative++;
            else zeros++;
        }

        sc.close();

        System.out.println("No of positives " + positive + "\n" + "No of negatives " + negative + "\n" + "No of zeros " + zeros);
    }
}
