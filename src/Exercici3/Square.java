package Exercici3;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return getWidth();
    }

    void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square s = new Square(2.0, "blue", true);
        System.out.println(s.getSide());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println(s.toString());
    }
}
