package shoppingcart;

import java.util.*;


public class AddToCart {
 public static void main(String[] args) {
     ArrayList<Product> productList = new ArrayList<>();
     ArrayList<Product> cart = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);

     // Sample products
     productList.add(new Product("laptop", 30000, 5));
     productList.add(new Product("mobile", 20000, 10));
     productList.add(new Product("airpods", 1200, 8));
     productList.add(new Product("headset", 600, 12));
    // productList.add(new Product("earphones", 600, 12));
     
     while (true) {
    	 System.out.println("=====================");
         System.out.println("1. Display Products");
         System.out.println("2. Add to Cart");
         System.out.println("3. Update Cart");
         System.out.println("4. Remove from Cart");
         System.out.println("5. your Cart");
         System.out.println("6. Exit");
         System.out.println("=====================");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 displayProducts(productList);
                 break;
             case 2:
                 addToCart(productList, cart, scanner);
                 break;
             case 3:
                 updateCart(cart, scanner);
                 break;
             case 4:
                 removeFromCart(cart, scanner);
                 break;
             case 5:
                yourcart(cart);
                 break;
             case 6:
                 System.out.println("Exit the cart! keep shop!!");
                 scanner.close();
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice.Please enter a valid option.");
         }
     }
 }

 private static void yourcart(ArrayList<Product> cart) {
	 
	 if (cart.isEmpty()) {
         System.out.println("Cart is empty. Nothing to added in your cart.");
         return ;
     }
	 
	 System.out.println("Your Cart:");
     System.out.println("Name\t\tPrice\t\tQuantity\tT_price");
     for (Product product : cart) {

    	double tprice=product.price*product.quantity;

         System.out.println(product.name + "\t\t" + product.price + "\t\t" + product.quantity+ "\t\t"+tprice );
     }
}


//private static void cartsummary(ArrayList<Product> cart) {
//	System.out.println("total price "); 
//	System.out.println(tprice);
	
	
	
//	 if (cart.isEmpty()) {
//        System.out.println("Cart is empty. Nothing to added in your cart.");
//        return ;
//    }
//	 
//	 System.out.println("Your Cart:");
//    System.out.println("Name\t\tPrice\t\tQuantity\tT_price");
//    for (Product product : cart) {
//
//   	double tprice=product.price*product.quantity;
//
//        System.out.println(product.name + "\t\t" + product.price + "\t\t" + product.quantity+ "\t\t"+tprice );
//    }
//}

private static void displayProducts(ArrayList<Product> productList) {
	 System.out.println(" ");
	 System.out.println("-----------------------");
     System.out.println("Available Products");
     System.out.println("Product_Name\tProduct_Price\tAvailable_Stocks");
     for (Product product : productList) {
         System.out.println(product.name + "\t\t" + product.price + "\t\t" + product.quantity);
     }
 }

 private static void addToCart(ArrayList<Product> productList, ArrayList<Product> cart, Scanner scanner) {
     displayProducts(productList);
     System.out.println("-----------------------");
     System.out.print("Enter the name of the product to add to the cart: ");
     String productName = scanner.next();

     // Find the product in the productList
     for (Product product : productList) {
         if (product.name.equalsIgnoreCase(productName)) {
             System.out.print("Enter the quantity to add: ");
             int quantity = scanner.nextInt();
             if (quantity > 0 && quantity <= product.quantity) {
                 // Add the product to the cart
                 Product cartProduct = new Product(product.name, product.price, quantity);
                 cart.add(cartProduct);

                 // Update the quantity in the productList
                 product.quantity -= quantity;

                 System.out.println(quantity + " " + product.name + " added to the cart.");
             } else {
                 System.out.println("Invalid quantity. Please enter a valid quantity.");
             }
             return;
         }
     }

     System.out.println("Product not found. Please enter a valid product name.");
 }

 private static void updateCart(ArrayList<Product> cart, Scanner scanner) {
     if (cart.isEmpty()) {
         System.out.println("Cart is empty. Nothing to update.");
         return;
     }

     System.out.println("Your Cart:");
     System.out.println("Product_Name\tProduct_Price\tQuantity");
     for (Product product : cart) {
         System.out.println(product.name + "\t\t" + product.price + "\t\t" + product.quantity);
     }

     System.out.print("Enter the name of the product to update in the cart: ");
     String productName = scanner.next();

     // Find the product in the cart
     for (Product product : cart) {
         if (product.name.equalsIgnoreCase(productName)) {
             try {
                 System.out.print("Enter the new quantity: ");
                 int newQuantity = scanner.nextInt();
                 
                 if (product.name==product.name) {
                	 System.out.println("products already added so we just updated the quantity");
                 }
                 
                 if (newQuantity > 0) {
                     // Update the quantity in the cart
                     product.quantity = newQuantity;
                     System.out.println(product.name + " quantity updated to " + newQuantity + " in the cart.");
                 } else {
                     System.out.println("Invalid quantity. Please enter a positive integer.");
                 }
             } catch (Exception e) {
                 System.out.println("Invalid input. Please enter a valid quantity.");
                 scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
             }
             return;
         }
     }

     System.out.println("Product not found in the cart. Please enter a valid product name.");
 }
 
 

 private static void removeFromCart(ArrayList<Product> cart, Scanner scanner) {
     if (cart.isEmpty()) {
         System.out.println("Cart is empty. Nothing to remove.");
         return;
     }

     System.out.println("Your Cart:");
     System.out.println("Product_Name\tProduct_Price\tYour_Quantity");
     for (Product product : cart) {
         System.out.println(product.name + "\t\t" + product.price + "\t" + product.quantity);
     }

     System.out.print("Enter the name of the product to remove from the cart: ");
     String productName = scanner.next();

     // Find the product in the cart
     for (Product product : cart) {
         if (product.name.equalsIgnoreCase(productName)) {
             // Remove the product from the cart
             cart.remove(product);
             System.out.println(product.name + " removed from the cart.");
             return;
         }
     }

     System.out.println("Product not found in the cart. Please enter a valid product name.");
     
     
     
     
 }
}





























/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<Product> cart;
    private Scanner scanner;

    public ShoppingCart() {
        cart = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayProductList() {
        System.out.println("Product List:");
        System.out.println("-----------------------------------------------------");
        System.out.println("|	Name	|	Price	|	Quantity	|");
        System.out.println("-----------------------------------------------------");
        for (Product product : cart) {
            System.out.printf("|	%-3s	|	$%-10.2f	|	%-13d	|\n", product.getName(), product.getPrice(), product.getQuantity());
        }
        System.out.println("-----------------------------------------------------");
    }

    public void addProduct() {
        try {
            System.out.println("Enter product name:");
            String name = scanner.nextLine();

            System.out.println("Enter product price:");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter product quantity:");
            int quantity = Integer.parseInt(scanner.nextLine());

            if (price < 0 || quantity < 0) {
                throw new IllegalArgumentException("Price and quantity cannot be negative.");
            }

            Product product = new Product(name, price, quantity);
            cart.add(product);
            System.out.println("Product added to cart.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for price/quantity. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateProduct() {
        try {
            displayProductList();
            System.out.println("Enter the index of the product you want to update:");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index < 0 || index >= cart.size()) {
                throw new IllegalArgumentException("Invalid index.");
            }

            System.out.println("Enter the new price:");
            double newPrice = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the new quantity:");
            int newQuantity = Integer.parseInt(scanner.nextLine());

            if (newPrice < 0 || newQuantity < 0) {
                throw new IllegalArgumentException("Price and quantity cannot be negative.");
            }

            cart.get(index).setPrice(newPrice);
            cart.get(index).setQuantity(newQuantity);
            System.out.println("Product updated successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for price/quantity. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeProduct() {
        try {
            displayProductList();
            System.out.println("Enter the index of the product you want to remove:");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index < 0 || index >= cart.size()) {
                throw new IllegalArgumentException("Invalid index.");
            }

            cart.remove(index);
            System.out.println("Product removed from cart.");
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Dub1 {
    public static void main(String[] args) {
    	
    	 ArrayList<Product> Item = new ArrayList<>();
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Display Product List");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Remove Product");
            System.out.println("5. List Cart");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    cart.displayProductList();
                    break;
                case 2:
                    cart.addProduct();
                    break;
                case 3:
                    cart.updateProduct();
                    break;
                case 4:
                    cart.removeProduct();
                    break;
                case 5:
                    cart.displayProductList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}

*/



