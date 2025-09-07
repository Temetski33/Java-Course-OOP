import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add methods here
    void addItem(String item, double cost, String category, int quantity) {
        groceryList.put(item, cost);
    }

    void removeItem(String item) {
        System.out.println("Removing \"" + item + "\" from the list...");
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery list:");
        int counter = 1;

        for (String key : groceryList.keySet()) {
            System.out.println(counter + ". " + key);
            counter++;
        }
    }

    public boolean checkItem(String item){
        System.out.print("Is \"" + item + "\" in the grocery list? ");
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Double cost : groceryList.values())
            totalCost = totalCost + cost;
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 0.2, "Fruit", 7);
        manager.addItem("Milk", 2, "Dairy", 1);
        manager.addItem("Bread", 3, "Bakery", 1);

        manager.displayList();
        System.out.println();
        System.out.println(manager.checkItem("Milk"));

        System.out.println();

        manager.removeItem("Milk");
        System.out.println();
        manager.displayList();

        System.out.println();
        System.out.println("Total cost: " + manager.calculateTotalCost() + "€");
    }


}

