/**
 * Shape.java
 * Divine Chamoh
 * Abstract superclass for three-dimensional shapes. Every concrete shape
 * must be able to report its surface area and volume.
 */
public abstract class Shape {

    /** @return the total surface area of the shape */
    public abstract double surface_area();

    /** @return the volume of the shape */
    public abstract double volume();
}
