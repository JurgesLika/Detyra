public class ResizableClass extends Circle implements Resizable{
    private double radius;

    public ResizableClass() {
        super.setRadius(radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public void resize(int percent) {
        double resizeFactor = 1 - percent/100.0;
         setRadius(getRadius()*resizeFactor);
    }
}
