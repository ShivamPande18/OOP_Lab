import java.util.Scanner;

public class TypeConvert {
    public static void main(String[] args) {
        int _int;
        double _double;
        char _char;

        Scanner sc = new Scanner(System.in);

        _int = sc.nextInt();
        _double = sc.nextDouble();
        _char = sc.next().charAt(0);

        sc.close();

        byte intToByte = (byte)_int;
        int charToInt = (int)_char;
        byte doubleToByte = (byte)_double;
        int doubleToInt = (int)_double; 

        System.out.println("Covertions are: \n");
        System.out.println(intToByte);
        System.out.println(charToInt);
        System.out.println(doubleToByte);
        System.out.println(doubleToInt);

    }
}
