import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeLetterWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a five-letter word: ");
        String word = sc.nextLine();
        
        if (word.length() != 5) {
            System.out.println("Invalid input. Please enter a five-letter word.");
            sc.close();
            return;
        }
        
        List<String> threeLetterWords = generateThreeLetterWords(word);
        
        System.out.println("Three-letter words derived from \"" + word + "\":");
        for (String threeLetterWord : threeLetterWords) {
            System.out.println(threeLetterWord);
        }
        sc.close();
    }
    
    public static List<String> generateThreeLetterWords(String word) {
        List<String> threeLetterWords = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(word.charAt(i));
                        sb.append(word.charAt(j));
                        sb.append(word.charAt(k));
                        threeLetterWords.add(sb.toString());
                    }
                }
            }
        }
        
        return threeLetterWords;
    }
}
