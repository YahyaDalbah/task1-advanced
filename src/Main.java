public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("book1", "a", "b", "c", "2");
        Magazine magazine1 = new Magazine("magazine1", "ma", "da", "eq", 3);
        library.addLibraryItem(book1);
        library.addLibraryItem(magazine1);
        library.borrowLibraryItem("book1");
        library.returnLibraryItem("book1");
        library.borrowLibraryItem("magazine1");

        library.displayAllItems();
    }
}