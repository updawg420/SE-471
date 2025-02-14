package sorting;
import model.Product;
import java.util.List;

public class Log_SortingUtilityProxy extends SortingUtility {
    // Bubble Sort returns in order: ID, Name, & Price
    // Quick Sort returns in order: Name, ID, & Price
    public static void logProducts(List<Product> items, int sortingApproach){
        for(Product p : items){
            if(sortingApproach == 1){
                System.out.println("ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
            }
            else if(sortingApproach == 2){
                System.out.println("Name: " + p.getName() + " ID: " + p.getId() + " Price: " + p.getPrice());
            }
        }
    }
}
