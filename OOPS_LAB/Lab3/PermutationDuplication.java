public class PermutationDuplication {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};

        for (int d1 : digits) {
            for (int d2 : digits) {
                for (int d3 : digits) {
                    for (int d4 : digits) {
                        int number = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
                        System.out.println(number);
                    }
                }
            }
        }
    }
}
