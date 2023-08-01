package ktds.ksh.cartoon;

public class CartoonVO {
	private String title;
	private int price;
	private int product;
	
	public CartoonVO(String title, int price, int product) {
		super();
		this.title = title;
		this.price = price;
		this.product = product;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	
	
}
