public class Magazine extends LibraryItem {
    private int edition;

    public Magazine(String title, String author, String publishDate, String summary, int edition) {
        super(title, author, publishDate, summary);
        this.edition = edition;
    }

    @Override
    public void borrowItem() {
        if (!getIsBorrowed()) {
            setIsBorrowed(true);
            System.out.println("I actually borrowed the magazine. " + getTitle());
        } else {
            System.out.println("The magazine is borrowed.");
        }
    }

    @Override
    public void returnItem() {
        setIsBorrowed(false);
        System.out.println("I actually returned the magazine. " + getTitle());
    }
}
