package Exercici2;
public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
    
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.toString());
    }
}

