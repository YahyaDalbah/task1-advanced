public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String publishDate, String summary, String genre) {
        super(title, author, publishDate, summary);
        this.genre = genre;
    }

    @Override
    public void borrowItem() {
        if (!getIsBorrowed()) {
            setIsBorrowed(true);
            System.out.println("You have borrowed the book: " + getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        setIsBorrowed(false);
        System.out.println("You have returned the book: " + getTitle());
    }

}
