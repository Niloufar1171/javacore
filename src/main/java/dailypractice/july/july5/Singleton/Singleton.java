package dailypractice.july.july5.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable , Cloneable{
    private static Singleton singletonInstance = null;

    private Singleton(){}

    public static Singleton getSingletonInstance(){

        if(singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
