public class Main {
    public static void main(String[] args) {
        // Create a ResizableCircle with radius 5
        ResizableClass circle = new ResizableClass();
        circle.setRadius(4);

        // Print the original radius and area
        System.out.println("Original radius: " + circle.getRadius());
        System.out.println("Original area: " + circle.getArea());

        // Resize the circle by reducing the radius by 20%
        circle.resize(20);

        // Print the resized radius and area
        System.out.println("Resized radius after reducing by 20%: " + circle.getRadius());
        System.out.println("New area after resizing: " + circle.getArea());

        // Resize the circle by reducing the radius by 50%
        circle.resize(50);

        // Print the resized radius and area
        System.out.println("Resized radius after reducing by 50%: " + circle.getRadius());
        System.out.println("New area after resizing: " + circle.getArea());
    }
}