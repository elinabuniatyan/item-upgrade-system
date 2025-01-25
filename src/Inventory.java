import java.io.*;
import java.util.*;


public class Inventory {
    private Map<String, List<Item>> items = new HashMap<>();

    public void addItem(Item item) {
        items.computeIfAbsent(item.getName(), k -> new ArrayList<>()).add(item);
    }

    public boolean upgradeItem(String itemName) {
        List<Item> itemList = items.get(itemName);
        if (itemList == null || itemList.size() < 2) {
            System.out.println("Not enough items to upgrade.");
            return false;
        }
        itemList.remove(0);
        Item upgradedItem = itemList.remove(0);
        upgradedItem.upgrade();
        addItem(upgradedItem);
        return true;
    }
    public void displayInventory() {
        items.forEach((name, list) -> {
            System.out.println(name + ": " + list);
        });
    }
}
