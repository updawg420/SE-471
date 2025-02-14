package sorting;
import model.Product;
import java.util.List;

public class Log_SortingUtilityProxy extends SortingUtility {
    // Will list the sorted products before returning to client

    // Bubble Sort returns in order: ID, Name, & Price
    //...

    // Quick Sort returns in order: Name, ID, & Price
    //...

    public Log_SortingUtilityProxy(List<Product> items) {
        System.out.println("Bubblesort");
        List<Product> bubbleItems = super.sort(items, 1);
        logProducts(items, 1);
        System.out.println("Quicksort:");
        List<Product> quickItems = super.sort(items, 2);
        logProducts(items, 2);
    }

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
