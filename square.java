/*
 * Ashton Chavez
 * square.java
 * November 12, 2024
 * 
 * Square class, which is a 2D shape, with methods for computing area.
 */

public class square extends TwoDimensionalShape {
    private double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}

