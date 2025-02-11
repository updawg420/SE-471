package sorting;

import model.Product;
import java.util.List;

public class SortingUtility {

    // Public Method, calls the specified sorting algorithm
    public List<Product> sort(List<Product> items, int sortingApproach){
        if(sortingApproach == 1){ // Bubble Sort
            //bubbleSort(items);

        } else if(sortingApproach == 2){ // Quick Sort
            //quickSort(items, 0, items.size()-1);

        }
        else {
            System.out.println("Please pick a valid Sorting Approach");
        }
    }


    // Private Utility Method using Quick Sort
    // returns in order: ID, Name, & Price
    private List<Product> bubbleSort(List<Product> items) {

        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (items.get(j).getId() > items.get(j + 1).getId()) {
                    // swap items[j] and items[j+1]
                    Product temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                    swapped = true;
                }
            }

            // if no two elements were swapped in the inner loop, then break
            if (!swapped) {
                break;
            }
        }

    }

    // Private Utility Method using Quick Sort
    // returns in order: Name, ID, & Price
    private List<Product> quickSort(List<Product> items) {



    }
}
