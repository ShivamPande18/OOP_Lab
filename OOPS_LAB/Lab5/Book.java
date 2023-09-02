import java.util.Scanner;

public class Book {
    String title;
    String author;
    int edition;
    
    Book(String _title, String _author, int _edition)
    {
        title = _title;
        author = _author;
        edition = _edition;
    }
}

class Example {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter books in ascending order");
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter title, autor and edition:");
            String title = sc.nextLine();
            String author = sc.nextLine();
            int edition = sc.nextInt();

            Book book = new Book(title, author, edition);
            books[i] = book;
        }

        String autChoice = sc.nextLine();
        for (int i = 0; i < 6; i++) {
            if(books[i].author ==  autChoice)
            {
                System.out.println(books[i].title + " by " + books[i].author );
            }
        }
        sc.close();
    }
}
