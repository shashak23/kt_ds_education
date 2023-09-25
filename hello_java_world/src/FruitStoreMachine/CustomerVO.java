package FruitStoreMachine;

public class CustomerVO {
	
	private String name;
	private int price;
	private int stock;
	
	public CustomerVO(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void addStock(int stock) {
		this.stock++;
	}

	public void refund() {
		this.stock--;
	}
}
