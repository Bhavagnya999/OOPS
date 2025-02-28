class Book {
    String BookTitle;
    String BookAuthor;
    int BookYearofPublication;

    public Book(String BookTitle, String BookAuthor, int BookYearofPublication) {
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.BookYearofPublication = BookYearofPublication;
    }

    public void Title() {
        System.out.println(BookTitle + " is Title");
    }

    public void Author() {
        System.out.println(BookAuthor + " is Author");
    }

    public void YearofPublication() {
        System.out.println(BookYearofPublication + " is Year of Publication");
    }
}

public class Main {
    public static void main(String[] args) {  // Corrected method signature
        Book book1 = new Book("Ghosts of the Silent Hill", "Amitav Ghosh", 1999);
        Book book2 = new Book("The Hungry Tide", "Amitav Ghosh", 2001);

        book1.Title();
        book1.Author();
        book1.YearofPublication();

        System.out.println();

        book2.Title();
        book2.Author();
        book2.YearofPublication();

        System.out.println();
    }
}
