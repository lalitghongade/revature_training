package Aug3.hashSetExamples;
import java.util.*;
public class ProductDetailsMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ProductDetails> productList = new HashSet<>();
		
		productList.add(new ProductDetails(2, "Milk", 19.99, 4.9, 5));
		productList.add(new ProductDetails(1, "Bread", 19.99, 4.5, 3));
		productList.add(new ProductDetails(4, "Chicken", 129.99, 4.4, 1));
		productList.add(new ProductDetails(2, "Milk", 19.99, 4.9, 5));
		productList.add(new ProductDetails(3, "Beer", 229.99, 4.6, 6));
		productList.add(new ProductDetails(4, "Chicken", 129.99, 4.4, 1));
		productList.add(new ProductDetails(5, "Nuts", 599.99, 3.9, 2));
		productList.add(new ProductDetails(1, "Bread", 19.99, 4.5, 3));
		productList.add(new ProductDetails(4, "Chicken", 129.99, 4.4, 1));
		
		
		ProductDetailsMain p = new ProductDetailsMain();
		System.out.println("Product List");
		p.printProduct(productList);
		
	}
	
	public void printProduct(Set<ProductDetails> productList) {
		for(ProductDetails p: productList) {
			System.out.println(p);
		}
	}

}
