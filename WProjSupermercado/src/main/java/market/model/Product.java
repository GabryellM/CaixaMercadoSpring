package market.model;

public class Product {
	
	private int prodCode;
	private String name;
	private double price;
	private int barCode;
	private int quantity;
	
	// constructors

	public Product() {
	
	}
	
	public Product(int prodCode, String name, double price, int barCode) {
		this.prodCode = prodCode;
		this.name = name;
		this.price = price;
		this.barCode = barCode;
	}
	
	// getters setters
	
	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int amount) {
		this.quantity = amount;
	}
	
}
