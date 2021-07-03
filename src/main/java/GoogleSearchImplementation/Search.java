package GoogleSearchImplementation;

public class Search {
	
	public String displayproduct(Product product) {
		
		if(product.getProductList().contains(product.getProductname())) {
			return product.getProductname();
	}

	return null;
}
}
