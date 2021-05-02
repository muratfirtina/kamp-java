package gamedemo;

public class Product {
	int productId;
	String productName;
	int productUnitPrice;
	
	public Product() {
		
	}

	public Product(int productId, String productName, int productUnitPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(int productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
}


