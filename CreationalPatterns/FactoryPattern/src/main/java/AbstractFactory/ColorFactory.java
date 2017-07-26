package AbstractFactory;

/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public class ColorFactory extends AbstractFactory {
    Color getColor(ColorType color) {
        switch(color){
            case Red:
                return new Red();
            case Blue:
                return new Blue();
            case Green:
                return new Green();
            default:
                return null;
        }
    }

    Shape getShape(ShapeType shape) {
        return null;
    }
}
