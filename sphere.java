/*
 * Ashton Chavez
 * sphere.java
 * November 12, 2024
 * 
 * Sphere class, which is a 3D shape, with methods for computing volume.
 */

public class sphere extends ThreeDimensionalShape {
    private double radius;

    public sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getName() {
        return "Sphere";
    }
}
