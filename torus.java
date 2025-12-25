/*
 * Ashton Chavez
 * torus.java
 * November 12, 2024
 * 
 * Torus class, which is a 3D shape, with methods for computing volume.
 */

public class torus extends ThreeDimensionalShape {
    private double majorRadius;  // Distance from the center of the hole to the center of the tube
    private double minorRadius;  // Radius of the tube

    public torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (2 * Math.PI * Math.PI) * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public String getName() {
        return "Torus";
    }
}
