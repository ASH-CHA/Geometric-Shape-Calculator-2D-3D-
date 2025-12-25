/*
 * Ashton Chavez
 * triangle.java
 * November 12, 2024
 * 
 * Triangle class, which is a 2D shape, with methods for computing area.
 */

public class triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

