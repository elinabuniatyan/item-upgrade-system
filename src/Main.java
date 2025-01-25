
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding predefined items manually
        inventory.addItem(new Item("Iron Shield", Rarity.GREAT));
        inventory.addItem(new Item("Iron Shield", Rarity.GREAT));
        inventory.addItem(new Item("Iron Sword", Rarity.EPIC));
        inventory.addItem(new Item("Iron Sword", Rarity.EPIC));

        // Display initial inventory
        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        inventory.upgradeItem("Iron Sword");
        inventory.upgradeItem("Iron Shield");

        // Display updated inventory after upgrades
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}