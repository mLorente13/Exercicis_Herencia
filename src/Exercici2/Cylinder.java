package Exercici2;
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = height;
        System.out.println(this.height);
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder is a subclass of Circle";
        
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 5);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getVolume());
        System.out.println(c.toString());
    }
}
