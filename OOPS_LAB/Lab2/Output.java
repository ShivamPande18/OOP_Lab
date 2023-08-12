public class Output {
    public static void main(String[] args) {
        int x1 =10;
        double y1 = x1; 
        System.out.println(y1);

        //type mismatch
        // double x2 = 10.5; 
        // int y2 = x2;
        // System.out.println(y2);

        double x3=10.5;
        int y3 = (int) x3;
        System.out.println(y3);
    }
}
