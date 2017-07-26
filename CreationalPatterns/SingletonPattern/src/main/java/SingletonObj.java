/**
 * Created by Alexandra.Gaman on 7/26/2017.
 */
public class SingletonObj {
    private static SingletonObj instance = new SingletonObj();

    private SingletonObj(){

    }

    public static SingletonObj getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello");
    }
}
