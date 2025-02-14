import model.Product;
import sorting.Log_SortingUtilityProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Hardcoded Products
        products.add(new Product(580, "ALL BEEF HOT DOG", 1.50));
        products.add(new Product(840, "CHICKEN BAKE", 2.99));
        products.add(new Product(760, "COMBO PIZZA SLICE", 1.99));
        products.add(new Product(1200, "DOUBLE CHUNK CHOCOLATE COOKIE!", 4.99));

        /*
        // Manual Product Input
        System.out.printf("Hello! Please enter following product details (ID, Name, Price)\nEnter -1 to finish.\n");
        // Loop to add products until -1 is entered at ID prompt
        while (true) {
            System.out.printf("ID: ");
            int id = Integer.parseInt(System.console().readLine());
            if (id == -1) {
                break;
            }

            System.out.printf("Name: ");
            String name = System.console().readLine();

            System.out.printf("Price: ");
            double price = Double.parseDouble(System.console().readLine());

            products.add(new Product(id, name, price));
        }
        */

        // Print Sorted Products
        // Bubble Sort returns in order: ID, Name, & Price
        // Quick Sort returns in order: Name, ID, & Price
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow would you like to sort the products?  (1 = bubblesort, 2 = quicksort)");
        int choice = scan.nextInt();
        if (choice == 1) {
            Log_SortingUtilityProxy.sort(products, choice);
            Log_SortingUtilityProxy.logProducts(products, choice);
        }
        else if (choice == 2) {
            Log_SortingUtilityProxy.sort(products, choice);
            Log_SortingUtilityProxy.logProducts(products, choice);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}