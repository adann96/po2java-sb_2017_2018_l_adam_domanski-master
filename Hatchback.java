public class Hatchback extends Car{
    public int year;
    public static double manufacturedDiscount=0.07;

    public Hatchback(double speed, double price, String color, int year) {
        super(speed, price, color);
        this.year = year;
    }

    @Override
    public double getSalePrice() {
        return this.price-(this.price*manufacturedDiscount);
    }

    @Override
    public String toString() {
        return "Hatchback [" +"year=" + year +", speed=" + speed +", price=" + price +", color='" + color + '\'' +']';
    }
}

