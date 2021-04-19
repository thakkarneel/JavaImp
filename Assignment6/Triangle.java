public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {


        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double computeArea() {
        return ((base * height) / 2);
    }

    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
