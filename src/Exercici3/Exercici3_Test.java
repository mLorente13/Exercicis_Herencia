package Exercici3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercici3_Test {

    @Test
    public void testShape() {
        Shape shape = new Shape("red", false);
        assertEquals("red", shape.getColor());
        assertFalse(shape.isFilled());
        assertEquals("Shape with color of red and not filled", shape.toString());

        Shape shape2 = new Shape();
        assertEquals("red", shape2.getColor());
        assertTrue(shape2.isFilled());
        assertEquals("Shape with color of red and filled", shape2.toString());

        Shape shape3 = new Shape("blue", true);
        assertEquals("blue", shape3.getColor());
        assertTrue(shape3.isFilled());
        assertEquals("Shape with color of blue and filled", shape3.toString());
    }

    @Test
    public void testCircle() {
        Circle circle = new Circle(5);
        assertEquals(5.0, circle.getRadius(), 0.0);
        assertEquals("red", circle.getColor());
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.0);
        assertEquals(78.53981633974483, circle.getArea(), 0.0);
        assertEquals("A Circle with radius=5.0, which is a subclass of Shape with color of red and filled", circle.toString());

        Circle circle2 = new Circle(5, "blue", false);
        assertEquals(5.0, circle2.getRadius(), 0.0);
        assertEquals("blue", circle2.getColor());
        assertEquals(31.41592653589793, circle2.getPerimeter(), 0.0);
        assertEquals(78.53981633974483, circle2.getArea(), 0.0);
        assertEquals("A Circle with radius=5.0, which is a subclass of Shape with color of blue and not filled", circle2.toString());

        Circle circle3 = new Circle();
        assertEquals(1.0, circle3.getRadius(), 0.0);
        assertEquals("red", circle3.getColor());
        assertEquals(6.283185307179586, circle3.getPerimeter(), 0.0);
        assertEquals(3.141592653589793, circle3.getArea(), 0.0);
        assertEquals("A Circle with radius=1.0, which is a subclass of Shape with color of red and filled", circle3.toString());
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(2.0, rectangle.getWidth(), 0.0);
        assertEquals(3.0, rectangle.getLength(), 0.0);
        assertEquals("red", rectangle.getColor());
        assertTrue(rectangle.isFilled());
        assertEquals(6.0, rectangle.getArea(), 0.0);
        assertEquals(10.0, rectangle.getPerimeter(), 0.0);
        assertEquals("Rectangle with width=2.0 and length=3.0, which is a subclass of Shape with color of red and filled", rectangle.toString());

        Rectangle rectangle2 = new Rectangle(2, 3, "blue", false);
        assertEquals(2.0, rectangle2.getWidth(), 0.0);
        assertEquals(3.0, rectangle2.getLength(), 0.0);
        assertEquals("blue", rectangle2.getColor());
        assertFalse(rectangle2.isFilled());
        assertEquals(6.0, rectangle2.getArea(), 0.0);
        assertEquals(10.0, rectangle2.getPerimeter(), 0.0);
        assertEquals("Rectangle with width=2.0 and length=3.0, which is a subclass of Shape with color of blue and not filled", rectangle2.toString());

        Rectangle rectangle3 = new Rectangle();
        assertEquals(1.0, rectangle3.getWidth(), 0.0);
        assertEquals(1.0, rectangle3.getLength(), 0.0);
        assertEquals("red", rectangle3.getColor());
        assertTrue(rectangle3.isFilled());
        assertEquals(1.0, rectangle3.getArea(), 0.0);
        assertEquals(4.0, rectangle3.getPerimeter(), 0.0);
        assertEquals("Rectangle with width=1.0 and length=1.0, which is a subclass of Shape with color of red and filled", rectangle3.toString());
    }

    @Test
    public void testSquare() {
        Square square = new Square(2);
        assertEquals(2.0, square.getSide(), 0.0);
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
        assertEquals(4.0, square.getArea(), 0.0);
        assertEquals(8.0, square.getPerimeter(), 0.0);
        assertEquals("Square with side=2.0, which is a subclass of Rectangle with width=2.0 and length=2.0, which is a subclass of Shape with color of red and filled", square.toString());

        Square square2 = new Square(2, "blue", false);
        assertEquals(2.0, square2.getSide(), 0.0);
        assertEquals("blue", square2.getColor());
        assertFalse(square2.isFilled());
        assertEquals(4.0, square2.getArea(), 0.0);
        assertEquals(8.0, square2.getPerimeter(), 0.0);
        assertEquals("Square with side=2.0, which is a subclass of Rectangle with width=2.0 and length=2.0, which is a subclass of Shape with color of blue and not filled", square2.toString());

        Square square3 = new Square();
        assertEquals(1.0, square3.getSide(), 0.0);
        assertEquals("red", square3.getColor());
        assertTrue(square3.isFilled());
        assertEquals(1.0, square3.getArea(), 0.0);
        assertEquals(4.0, square3.getPerimeter(), 0.0);
        assertEquals("Square with side=1.0, which is a subclass of Rectangle with width=1.0 and length=1.0, which is a subclass of Shape with color of red and filled", square3.toString());
    }

}