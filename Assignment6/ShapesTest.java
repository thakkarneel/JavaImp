import java.util.ArrayList;

public class ShapesTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<>();
        Shapes s = new Shapes(shapesList);

        Triangle t1 = new Triangle(3, 8);
        Triangle t2 = new Triangle(20, 18);

        Circle c1 = new Circle(8);
        Circle c2 = new Circle(18);

        Rectangle r1 = new Rectangle(5, 8);
        Rectangle r2 = new Rectangle(6, 18);

        Hexagon h1 = new Hexagon(52);
        Hexagon h2 = new Hexagon(68);
        shapesList.add(t1);
        shapesList.add(t2);
        shapesList.add(c1);
        shapesList.add(c2);
        shapesList.add(r1);
        shapesList.add(r2);
        shapesList.add(h1);
        shapesList.add(h2);

        s.compute();
        System.out.println();
        
        System.out.println(s.max().toString());
        System.out.println(s.min());

    }
}
