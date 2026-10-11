/**
 * ShapeArray.java
 * Divine Chamoh
 * Driver class: stores one Sphere, one Cylinder, and one Cone in a Shape
 * array and prints each object using its toString method (polymorphism).
 */
public class ShapeArray {

    public static void main(String[] args) {

        Shape[] shapeArray = {
            new Sphere(5.0),
            new Cylinder(3.0, 7.0),
            new Cone(4.0, 6.0)
        };

        System.out.println("=== Shape Instance Data ===");
        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
