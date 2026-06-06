class GridItem {
    private String itemId;
    private String itemName;
    private int quantity;

    // Constructor
    public GridItem(String itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Getter
    public String getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return itemId + " - " + itemName + " (Qty: " + quantity + ")";
    }
}

class Warehouse {
    private GridItem[][] grid;

    // Constructor
    public Warehouse(int rows, int cols) {
        grid = new GridItem[rows][cols];
    }

    // Add item
    public void addItem(int row, int col, GridItem item) {
        if (row < grid.length && col < grid[0].length) {
            grid[row][col] = item;
        }
    }

    // Search item by ID
    public void searchItem(String itemId) {
        System.out.println("Searching for item ID: " + itemId);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] != null &&
                    grid[i][j].getItemId().equals(itemId)) {

                    System.out.println("Item found at Row: "
                            + i + ", Column: " + j);
                    return;
                }
            }
        }

        System.out.println("Item not found in warehouse");
    }

    // Display warehouse grid
    public void displayGrid() {
        System.out.println("\nWarehouse Grid:");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] != null)
                    System.out.print("[" + grid[i][j] + "] ");
                else
                    System.out.print("[Empty] ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(5, 5);

        // Populate Grid
        warehouse.addItem(0, 0,
                new GridItem("I101", "Laptop", 10));

        warehouse.addItem(1, 2,
                new GridItem("I102", "Phone", 25));

        warehouse.addItem(3, 4,
                new GridItem("I103", "Keyboard", 15));

        // Display Grid
        warehouse.displayGrid();

        // Search Items
        warehouse.searchItem("I102");
        warehouse.searchItem("I999");
    }
}
