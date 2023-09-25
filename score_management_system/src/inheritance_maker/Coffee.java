package inheritance_maker;

public class Coffee extends Drink{
	private String extractType;
	private String flavor;
	public String getExtractType() {
		return extractType;
	}
	public void setExtractType(String extractType) {
		this.extractType = extractType;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
}
