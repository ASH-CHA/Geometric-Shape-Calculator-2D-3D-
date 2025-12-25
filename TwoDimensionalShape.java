/*
 * Ashton Chavez
 * TwoDimensionalShape.java
 * November 12, 2024
 * 
 * Abstract class for 2D shapes that extends Shape and defines the method for calculating area.
 */

public abstract class TwoDimensionalShape extends shape {

    public TwoDimensionalShape() {
        super(2);  // 2D shapes have 2 dimensions
    }

    public abstract double getArea();
}
