import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapesList;

    public Shapes(ArrayList<Shape> shapesList) {
        this.shapesList = shapesList;
    }


    public void add(Shape e) {
        shapesList.add(e);

    }

    public void remove(Shape e) {
        shapesList.remove(e);

    }

    public ArrayList<Shape> getShapesList() {
        return shapesList;
    }

    public void setShapesList(ArrayList<Shape> shapesList) {
        this.shapesList = shapesList;
    }

    public void compute() {
        for (Shape e : shapesList) {

            System.out.println(e.computeArea());
        }
    }


    public void run() {
        compute();
    }

    public Shape max() {
        Shape max = (Shape) shapesList.get(0);
        for (Shape s : shapesList) {

            if (s.computeArea() > max.computeArea()) {
                max = s;
            }
        }
        return max;
    }

    public Shape min() {
        Shape min = (Shape) shapesList.get(0);
        for (Shape s : shapesList) {

            if (s.computeArea() < min.computeArea()) {
                min = s;
            }
        }
        return min;
    }


}
