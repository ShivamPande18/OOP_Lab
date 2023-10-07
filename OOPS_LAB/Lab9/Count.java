import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String article = sc.nextLine();
        
        int c=0,w=1,l=1,v=0;

        int curWord = 0;
        for (int i = 0; i < article.length(); i++) {
            curWord++;
            c++;
            if(article.charAt(i) == ' ' && curWord !=0)
            {
                w++;
                curWord=0;
            }
            else if(article.charAt(i) == '\n')
            {
                l++;
            }
            if(article.toLowerCase().charAt(i) == 'a' || article.toLowerCase().charAt(i) == 'e' ||
            article.toLowerCase().charAt(i) == 'i' ||
            article.toLowerCase().charAt(i) == 'o' ||
            article.toLowerCase().charAt(i) == 'u' )
            {
                v++;
            }
        }
        System.out.println("char = " + c + " word = " + w + " lines = " + l + " vowels = " + v);
        sc.close();
        
    }
}
