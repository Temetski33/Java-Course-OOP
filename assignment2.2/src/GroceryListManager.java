import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here
    void addItem(String item) {
        groceryList.add(item);
    }

    void removeItem(String item) {
        System.out.println("Removing \"" + item + "\" from the list...");
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery list:");
        int counter = 1;
        for (String item : groceryList) {
            System.out.println(counter + ". " + item);
            counter++;
        }
    }

    public boolean checkItem(String item){
        System.out.print("Is \"" + item + "\" in the grocery list? ");
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        manager.displayList();
        System.out.println();
        System.out.println(manager.checkItem("Milk"));

        System.out.println();

        manager.removeItem("Milk");
        System.out.println();
        manager.displayList();
    }


}

