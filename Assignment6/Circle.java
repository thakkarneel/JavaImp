public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
     
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return ((3.14) * (radius * radius));
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
