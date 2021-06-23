import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.println("");
		System.out.println("Enter product data: ");

		System.out.print("Nome: ");
		String name = ler.nextLine();
		
		System.out.print("price: ");
		double price = ler.nextDouble();

        Product product = new Product(name, price);

		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		System.out.println("Update quantity: " + product.getQuantity());

		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		int quantity = ler.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock");
		quantity = ler.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		ler.close();
    }
}
