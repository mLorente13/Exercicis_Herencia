package Exercici3;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }
    public static void main(String[] args) {
        Circle c = new Circle(2.0, "blue", true);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());
    }
}
