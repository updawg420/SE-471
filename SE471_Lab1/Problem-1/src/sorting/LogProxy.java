package sorting;
import model.Product;
import java.util.List;

public class LogProxy {
    public static void logProducts(List<Product> items){
        for(Product p : items){
            System.out.println("Name: " + p.getName() + " ID: " + p.getId() + " Price: " + p.getPrice());
        }
    }
}
