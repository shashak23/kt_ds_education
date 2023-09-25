package vacancehomework;

public class Temperature {
	
	private String date;
    private double celsius;
    private double fahrenheit;
    
	public Temperature(String date, double celsius, double fahrenheit) {
		super();
		this.date = date;
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
    
    

}
