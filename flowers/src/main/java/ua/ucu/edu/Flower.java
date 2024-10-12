package ua.ucu.edu;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;


    public Flower() {
        this.sepalLength = 0.0;
        this.color = FlowerColor.UNKNOWN;
        this.price = 0.0;
    }


    public Flower(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }


    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double newSepalLength) {
        this.sepalLength = newSepalLength;
    }

    public String getColor() {
        return color.getHexCode();
    }

    public void setColor(FlowerColor newColor) {
        this.color = newColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
