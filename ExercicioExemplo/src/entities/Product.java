package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//construtor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//construtor
	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public int getQuantity(){
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", R$" + String.format("%.2f", price)
				+ ", Quantity: " + quantity 
				+ ", Units Total: R$ "
				+ String.format("%.2f ", totalValueInStock());
	}
}