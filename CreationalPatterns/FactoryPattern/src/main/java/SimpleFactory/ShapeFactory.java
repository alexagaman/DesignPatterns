package SimpleFactory;

/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public class ShapeFactory {

    public Shape getShape(ShapeType type){
        switch(type){
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
