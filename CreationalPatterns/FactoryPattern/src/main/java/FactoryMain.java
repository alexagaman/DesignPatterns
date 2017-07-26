/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(ShapeType.Circle);
        shape.draw();
        shape = factory.getShape(ShapeType.Rectangle);
        shape.draw();
        shape = factory.getShape(ShapeType.Square);
        shape.draw();
    }
}
