/**
 * Cone.java
 * Divine Chamoh
 * A right circular cone defined by its radius and height.
 */
public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Cone     (radius = %.2f, height = %.2f)%n  Surface Area: %.2f%n  Volume:       %.2f",
                radius, height, surface_area(), volume());
    }
}
