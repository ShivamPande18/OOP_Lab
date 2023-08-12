import java.util.Scanner;

class RectangleArea {
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        l = sc.nextInt();

        System.out.println("Enter breadth:"); 
        b = sc.nextInt();

        sc.close();

        System.out.println("Circumference = " + 2*(l+b));
        System.out.println("Area = " + (l*b));
    }
}
