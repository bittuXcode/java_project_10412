class Item {
    String itemId;
    String itemName;
    int quantity;

    Item(String id, String name, int qty) {
        itemId = id;
        itemName = name;
        quantity = qty;
    }

    void display() {
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Quantity: " + quantity);
    }
}

class Warehouse {
    Item item1, item2, item3;

    void addItems() {
        item1 = new Item("I101", "Laptop", 10);
        item2 = new Item("I102", "Phone", 25);
        item3 = new Item("I103", "Tablet", 15);
    }

    void showItems() {
        System.out.println("Items in Warehouse:\n");

        item1.display();
        System.out.println();

        item2.display();
        System.out.println();

        item3.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();

        w.addItems();
        w.showItems();
    }
}