import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            result.append(currentChar).append(currentChar);
        }
        
        System.out.println("Replaced word: " + result.toString());
        scanner.close();
    }
}
