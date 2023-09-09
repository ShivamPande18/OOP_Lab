public class PermutationNoDuplication {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        generateCombinations(digits);
    }

    public static void generateCombinations(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (j != i) {
                    for (int k = 0; k < digits.length; k++) {
                        if (k != i && k != j) {
                            for (int l = 0; l < digits.length; l++) {
                                if (l != i && l != j && l != k) {
                                    int[] combination = {digits[i], digits[j], digits[k], digits[l]};
                                    printCombination(combination);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void printCombination(int[] combination) {
        for (int digit : combination) {
            System.out.print(digit);
        }
        System.out.println();

}
}
