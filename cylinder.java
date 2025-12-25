/*
 * Ashton Chavez
 * cylinder.java
 * November 12, 2024
 * 
 * Cylinder class, which is a 3D shape, with methods for computing volume.
 */

public class cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}

