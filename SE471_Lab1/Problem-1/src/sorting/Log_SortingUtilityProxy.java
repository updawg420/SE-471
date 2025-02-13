package sorting;
import model.Product;
import java.util.List;

public class Log_SortingUtilityProxy {
    // Will list the sorted products before returning to client

    // Bubble Sort returns in order: ID, Name, & Price
    //...

    // Quick Sort returns in order: Name, ID, & Price
    //...

    public static void logProducts(List<Product> items){
        for(Product p : items){
            System.out.println("Name: " + p.getName() + " ID: " + p.getId() + " Price: " + p.getPrice());
        }
    }
}
