public abstract class LibraryItem {
    private String title;
    private String author;
    private String publishDate;
    private String summary;
    private boolean isBorrowed = false;

    public LibraryItem(String title, String author, String publishDate, String summary) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.summary = summary;
    }

    public abstract void borrowItem();
    public abstract void returnItem();

    public void displayStatus() {
        String status = isBorrowed ? "Borrowed" : "Available";
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + status);
    }
    public String getTitle() {
        return title;
    }
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
    public boolean getIsBorrowed() {
        return isBorrowed;
    }
}