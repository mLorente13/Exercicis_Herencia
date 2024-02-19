package Exercici3;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return this.filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape with color of " + this.color + " and " + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape s = new Shape("red", true);
        System.out.println(s.getColor());
        System.out.println(s.isFilled());
        System.out.println(s.toString());
    }
}
