/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
