package Exercici3;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return this.length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return this.width * this.length;
    }

    double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public String toString() {
        return "Rectangle with width=" + this.width +" and length="+this.length+ ", which is a subclass of " + super.toString();
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2.0, 3.0, "blue", true);
        System.out.println(r.getWidth());
        System.out.println(r.getLength());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
    }
}
