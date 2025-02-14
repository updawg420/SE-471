import model.Product;
import sorting.Log_SortingUtilityProxy;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("\nHow would you like to sort the products?  (1 = bubblesort, 2 = quicksort)");


        // Print Products
        System.out.println("\nList of Products:");
        for (Product prod : products) {
            System.out.println(prod.getId() + ", " + prod.getName() + ", " + prod.getPrice());


        }
        new Log_SortingUtilityProxy(products);
    }
}