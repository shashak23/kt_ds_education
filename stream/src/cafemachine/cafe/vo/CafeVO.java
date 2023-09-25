package cafemachine.cafe.vo;

import java.util.ArrayList;
import java.util.List;

import cafemachine.coffee.vo.CoffeeVO;


public class CafeVO {
	
	private String brand;
	private String franchiseName;
	private String franchiseManager;
	
//	private CoffeeVO coffee;
	private List<CoffeeVO> coffeeList;
	
	public CafeVO() {
//	this.brand = brand;
//	this.franchiseName = franchiseName;
//	this.franchiseManager = franchiseManager;
	this.coffeeList = new ArrayList<>();
}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFranchiseName() {
		return franchiseName;
	}
	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}
	public String getFranchiseManager() {
		return franchiseManager;
	}
	public void setFranchiseManager(String franchiseManager) {
		this.franchiseManager = franchiseManager;
	}
	public List<CoffeeVO> getCoffeeList() {
		return coffeeList;
	}
	public void setCoffeeList(List<CoffeeVO> coffeeList) {
		this.coffeeList = coffeeList;
	}
	
	public void addCoffee(CoffeeVO coffee) {
		this.coffeeList.add(coffee);
	}
	
	public void showMenu() {
		for(int i=0; i < coffeeList.size(); i++) {
			System.out.println(coffeeList.get(i).getName());
			System.out.println(coffeeList.get(i).getPrice());
		}
	}
//	public CoffeeVO getCoffee() {
//		return coffee;
//	}
//	public void setCoffee(CoffeeVO coffee) {
//		this.coffee = coffee;
//	}
	
	

}
