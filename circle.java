/*
 * Ashton Chavez
 * circle.java
 * November 12, 2024
 * 
 * Circle class, which is a 2D shape, with methods for computing area.
 */

public class circle extends TwoDimensionalShape {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
