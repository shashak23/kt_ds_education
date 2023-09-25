package vacancehomework;

public class Product {
	
	private String productName;
	private int price;
	private String brand;
	
	
	public Product(String productName, int price, String brand) {
		super();
		this.productName = productName;
		this.price = price;
		this.brand = brand;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
