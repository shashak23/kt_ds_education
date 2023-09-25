package inheritance_maker;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
	
	private List<Product> productList;
	
	public Cafe() {
		this.productList = new ArrayList<>();
	}
	
	public void add(Product product) {
		productList.add(product);
	}
	
	public void showAllInstance() {
		for(Product p : productList) {
		
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			
			if(p instanceof Tea) {
				// 캐스팅하고
				Tea t = (Tea) p;
				// 출력하기
				System.out.println(t.getHerdType());
			}
			else if (p instanceof Coffee) {
				Coffee c = (Coffee) p;
				System.out.println(c.getFlavor());
				System.out.println(c.getFlavor());
				
			}
			else if (p instanceof NonCoffee) {
				NonCoffee nc = (NonCoffee) p;
				System.out.println(nc.getBlend());
			}
			else if (p instanceof Cake) {
				Cake ck = (Cake) p;
				System.out.println(ck.getSize());
				System.out.println(ck.getCalories());
			}
			else if (p instanceof Cookie) {
				Cookie co = (Cookie) p;
				System.out.println(co.getColor());
			}
//			else if(p instanceof Desert) {
//				Desert d = (Desert) p;
//				System.out.println(p.isPacking());
//			}
		}
	}

}
