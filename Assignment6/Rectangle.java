public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {

        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double computeArea() {
        return ((length * width));
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
