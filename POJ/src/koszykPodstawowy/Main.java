package koszykPodstawowy;

import java.util.ArrayList;

import koszykPodstawowy.model.*;

public class Main {
	public static ArrayList<Product> getSampleProducts(int n){
		ArrayList<Product> sample = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			Product p = new Product("Product "+ i, i * 25);
			sample.add(p);
		}
		return sample;
	}
	
	public static Cart getSampleCart(){
		Cart c = new Cart();
		for(Product p : getSampleProducts(10)){
			c.getItems().add(new CartItem(p));
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getSampleCart().getItems());
	}
	
}
