package GoogleSearchImplementation;


import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String Productname;
	private int Price;
	public Product(String productname, int price) {
	
		Productname = productname;
		Price = price;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	public List<String>getProductList(){
		List<String>productList =new ArrayList<>();
		productList.add("cucumber");
		productList.add("Aws");
		productList.add("Java");
		return productList;
	
		
		
		
		
	}

}
