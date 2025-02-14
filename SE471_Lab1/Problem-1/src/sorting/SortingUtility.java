package sorting;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static sorting.Log_SortingUtilityProxy.logProducts;

public class SortingUtility {
    List<Product> items;
    // Public Method, calls the specified sorting algorithm
    public static List<Product> sort(List<Product> items, int sortingApproach){
        if(sortingApproach == 1){ // Bubble Sort
            return bubbleSort(items);

        } else if(sortingApproach == 2){ // Quick Sort
            return quickSort(items, 0, items.size()-1);

        }
        else {
            System.out.println("Please pick a valid Sorting Approach");
        }
        return null;
    }


    // Private Utility Method using Quick Sort
    private static List<Product> bubbleSort(List<Product> items) {

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
        return items;
    }

    // Private Utility Method using Quick Sort
    private static List<Product> quickSort(List<Product> items, int low, int high) {
        if(low < high){
            //get the ID of the item in the high position in the list
            int highId = items.get(high).getId();
            //set i to low - 1
            int pivot = low - 1;
            //set j to low and loop through until 1 before high
            for (int j = low; j < high; j++) {
                //if the ID is less than or equal to the pivot increment i and swap the two items
                if(items.get(j).getId() <= highId){
                    pivot++;
                    Collections.swap(items, pivot, j);
                }
            }
            Collections.swap(items, pivot + 1, high);


            quickSort(items, low, pivot);
            quickSort(items, pivot + 1, high);
        }
        return items;
    }

}
