/*
 * Ashton Chavez
 * cone.java
 * November 12, 2024
 * 
 * Cone class, which is a 3D shape, with methods for computing volume.
 */

public class cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    @Override
    public String getName() {
        return "Cone";
    }
}

