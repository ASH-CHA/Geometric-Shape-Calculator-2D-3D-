/*
 * Ashton Chavez
 * shape.java
 * November 12, 2024
 * 
 * The base abstract class for representing general shapes.
 */

public abstract class shape {
    private int numberOfDimensions;

    public shape(int dimensions) {
        this.numberOfDimensions = dimensions;
    }

    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }

    public abstract String getName();
}
