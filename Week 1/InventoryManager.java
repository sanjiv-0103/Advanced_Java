import java.util.*;

public class InventoryManager {

    HashMap<String, Integer> stock = new HashMap<>();

    public void addProduct(String product, int quantity) {
        stock.put(product, quantity);
    }

    public void purchase(String product) {

        if (stock.get(product) > 0) {
            stock.put(product, stock.get(product) - 1);
            System.out.println("Purchase successful");
        } else {
            System.out.println("Out of stock");
        }
    }

    public static void main(String[] args) {

        InventoryManager im = new InventoryManager();

        im.addProduct("IPHONE", 5);

        im.purchase("IPHONE");
        im.purchase("IPHONE");
    }
}