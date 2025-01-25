package problem.statement.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args) {
        // Create product objects
        Product electronicItem = new Electronics(101, "Smartphone", 1000, 10);
        Product clothingItem = new Clothing(102, "Jacket", 200, 20);
        Product groceryItem = new Groceries(103, "Apples", 50, 5);

        // List to hold all products
        List<Product> products = new ArrayList<>();
        products.add(electronicItem);
        products.add(clothingItem);
        products.add(groceryItem);

        // Calculate and print the final price for each product (price + tax - discount)
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() - discount;

            // If the product is taxable, calculate the tax
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                double tax = taxableProduct.calculateTax();
                finalPrice += tax;
                taxableProduct.getTaxDetails();
            }

            // Print final price after discount and tax
            System.out.println("Final price for " + product.getName() + " is: " + finalPrice);
            System.out.println();
        }
    }
}

