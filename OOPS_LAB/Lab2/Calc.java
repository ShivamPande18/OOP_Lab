import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        float num1,num2;
        char op;

        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number, operator, second number:");
            
            num1 = sc.nextFloat();
            op = sc.next().charAt(0);
            num2 = sc.nextFloat();

            switch (op) {
                case '+':
                    System.out.println("Answer = " + (num1+num2));
                    break;

                case '-':
                    System.out.println("Answer = " + (num1-num2));
                    break;
                
                case '*':
                    System.out.println("Answer = " + (num1*num2));
                    break;

                case '/':
                    System.out.println("Answer = " + (num1/num2));
                    break;
            
                default:
                    System.out.println("Wrong operator");
                    break;
            }
            
            System.out.println("Do another (y/n)?");
            char choice = sc.next().charAt(0);

            if(choice == 'n' || choice == 'N') break;
        }

        sc.close();
        
    }
}
