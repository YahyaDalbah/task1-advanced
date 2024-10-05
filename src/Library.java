import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems = new ArrayList<>();

    public void addLibraryItem(LibraryItem item){
        libraryItems.add(item);
    }
    public void borrowLibraryItem(String title){
        for (int i = 0; i < libraryItems.size(); i++){
            if (libraryItems.get(i).getTitle().equals(title)){
                libraryItems.get(i).borrowItem();
                return;
            }
        }
        System.out.println("item not found");
    }
    public void returnLibraryItem(String title){
        for (int i = 0; i < libraryItems.size(); i++){
            if (libraryItems.get(i).getTitle().equals(title)){
                libraryItems.get(i).returnItem();
                return;
            }
        }
        System.out.println("item not found");
    }
    public void displayAllItems(){
        for (int i = 0; i < libraryItems.size(); i++){
            libraryItems.get(i).displayStatus();
        }
    }
}
