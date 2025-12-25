/*
 * Ashton Chavez
 * ThreeDimensionalShape.java
 * November 12, 2024
 * 
 * Abstract class for 3D shapes that extends Shape and defines the method for calculating volume.
 */

public abstract class ThreeDimensionalShape extends shape {

    public ThreeDimensionalShape() {
        super(3);  // 3D shapes have 3 dimensions
    }

    public abstract double getVolume();
}
