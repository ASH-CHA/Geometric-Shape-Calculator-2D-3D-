/*
 * Ashton Chavez
 * cube.java
 * November 12, 2024
 * 
 * Cube class, which is a 3D shape, with methods for computing volume.
 */

public class cube extends ThreeDimensionalShape {
    private double side;

    public cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String getName() {
        return "Cube";
    }
}

