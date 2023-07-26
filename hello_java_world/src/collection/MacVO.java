package collection;

public class MacVO {
	
	private String name;
	private String cheap;
	private int price;
	
	public MacVO(String name, String cheap, int price) {
		super();
		this.name = name;
		this.cheap = cheap;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheap() {
		return cheap;
	}
	public void setCheap(String cheap) {
		this.cheap = cheap;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
