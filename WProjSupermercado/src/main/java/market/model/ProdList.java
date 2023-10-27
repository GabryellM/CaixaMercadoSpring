package market.model;
import java.util.ArrayList;
import java.util.List;

public class ProdList {
	
	private static ArrayList<Product> products = new ArrayList<Product>();
	private static ProdList instance;
	
	public void addProd(Product product) {
		products.add(product);
	}
	
	public static ProdList getInstance() {
		if(instance == null) {
			instance = new ProdList();
		}
		return instance;
	}
	
	public Product getProductByBarCode(int barCode){
		for(Product prod : products){
			if(prod.getBarCode() == barCode){
				return prod;
			}
		}
		return null;
	}
	

	public void addQuantity(int amount, int barCode) {
		if(amount>0) {
			for(Product prod : products) {
				if(prod.getBarCode() == barCode) {
					prod.setQuantity(amount);
				}
			}
		}
	}

	public void clearList() {
			products.clear();
	}
	
}