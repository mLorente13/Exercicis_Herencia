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
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.0);
        assertEquals("red", circle.getColor());
        // assertEquals(, getArea())
        // assertEquals(, getPerimeter)
    }

}