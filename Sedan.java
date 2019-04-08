public class Sedan extends Car {
    int length;

    public Sedan(double speed, double price, String color, int length) {
        super(speed, price, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(this.length<4500) return 0.9*this.price;
        return this.price;
    }

    @Override
    public String toString() {
        return "Sedan [" + "length=" + length + ", speed=" + speed + ", price=" + price + ", color='" + color + '\'' + ']';
    }
}

