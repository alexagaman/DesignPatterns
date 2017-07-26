package AbstractFactory;

/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(ColorType color);
    abstract Shape getShape(ShapeType shape);
}
