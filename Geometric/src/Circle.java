public class Circle implements GeometricObject{
    private double radius;
    public Circle(){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
