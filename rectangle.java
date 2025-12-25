/*
 * Ashton Chavez
 * rectangle.java
 * November 12, 2024
 * 
 * Rectangle class, which is a 2D shape, with methods for computing area.
 */

public class rectangle extends TwoDimensionalShape {
    private double length, width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
