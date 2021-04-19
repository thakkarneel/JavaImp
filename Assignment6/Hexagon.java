public class Hexagon implements Shape {
    private int sideLength;

    public Hexagon(int sideLength) {
      
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public double computeArea() {
        return ((5.19 / 2) * (sideLength * sideLength));
    }

    public String toString() {
        return "Hexagon{" +
                "sideLength=" + sideLength +
                '}';
    }
}
