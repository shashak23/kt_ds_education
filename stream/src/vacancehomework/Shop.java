package vacancehomework;

import java.util.List;

public class Shop {

	private ProductList productList;
    private int totalPrice; // money

	public Shop(ProductList productList) {
		super();
		this.productList = productList;
	}

	// 판매
	public void sellProduct(String productName) {
//        for (Product product : productList.getProductList()) {
//            if (product.getProductName().equals(productName)) {
//            	totalPrice += product.getPrice();
//                System.out.println(productName + " 제품이 판매되었습니다.");
//                return;
//            }
//        }
		// procudtList에서 list인스천스를 가져온다.
		List<Product> products = this.productList.getProductList();
		// 못 적음 ㅠㅠ 
		for(Product product : products) {
			productName = product.getProductName();
			if(productName.equals(productName)) {
				this.totalPrice += product.getPrice();
				// ProductList에서 product에 해당하는 상품을 제거한다
				products.remove(product);
				break;
			}
		}
        System.out.println(productName + " 제품이 상점에 없습니다.");
    }

	// 반환
    public int getTotalPrice() {
        return totalPrice;
    }

    // 모든 항목
    public void printAllProducts() {
		List<Product> products = this.productList.getProductList();
        System.out.println("상품 목록:");
//        for (Product product : productList.getProductList()) {
//            System.out.println("제품명: " + product.getProductName() 
//            					+ "가격: " + product.getPrice() 
//            					+ "브랜드: " + product.getBrand());
//        }
        String productName = null;
        int totalprice = 0;
        String brand = null;
        for (Product product : products) {
        	productName = product.getProductName();
        	totalprice = product.getPrice();
        	brand = product.getBrand();
        }
    }
    
    public static void main(String[] args) {
		
    	ProductList list = new ProductList();
    	Product product1 = new Product("실바니안 패밀리", 5000, "실바니안");
    	list.addProductList(product1);
    	
    	Product product2 = new Product("mp3", 5000, "아이리버");
    	list.addProductList(product2);

    	Product product3 = new Product("스마트폰", 50000, "애니콜");
    	list.addProductList(product3);
    	
    	Shop shop = new Shop(list);
    	shop.printAllProducts();
    	
    	int money = 0;
    	shop.sellProduct("실바니안 패밀리");
    	money = shop.getTotalPrice();
    	System.out.println(money);
    	
    	shop.printAllProducts();
	}
    
}
