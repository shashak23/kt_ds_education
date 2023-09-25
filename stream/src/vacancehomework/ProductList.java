package vacancehomework;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	private List<Product> productlist;

	public ProductList() {
		super();
		this.productlist = new ArrayList<>();
	}

	public List<Product> getProductList() {
		return productlist;
	}

	public void setProductList(List<Product> productlist) {
		this.productlist = productlist;
	}
	
	// 프로덕트 리스트에 프로덕트를 추가
	public void addProductList(Product product) {
		this.productlist.add(product);
	}
	
	public static void main(String[] args) {
		ProductList productList = new ProductList();
		
		Product product1 = new Product("헤드폰", 10000, "아이리버");
		productList.addProductList(product1);
		
		Product product2 = new Product("실바니안 유치원", 110000, "실바니안 패밀리");
		productList.addProductList(product2);
	}
}
