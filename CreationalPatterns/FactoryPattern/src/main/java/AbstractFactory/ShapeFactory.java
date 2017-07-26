package AbstractFactory;

/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public class ShapeFactory extends AbstractFactory {


    Color getColor(ColorType color) {
        return null;
    }

    Shape getShape(ShapeType shape) {
        switch(shape){
            case Circle:
                return new Circle();
            case Square:
                return new Square();
            case Rectangle:
                return new Rectangle();
            default:
                return null;
        }
    }
}
