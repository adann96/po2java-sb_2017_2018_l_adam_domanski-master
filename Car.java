	public class Car {
	    public double speed;
	    public double price;
	    public String color;

	    public Car() {
	    }

	    public Car(double speed, double price, String color) {
	        this.speed = speed;
	        this.price = price;
	        this.color = color;
	    }

	    public double getSalePrice(){
	        return this.price;
	    }
	}
