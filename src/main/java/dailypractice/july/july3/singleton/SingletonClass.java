package dailypractice.july.july3.singleton;

public class SingletonClass {

    private static SingletonClass singletonInstance = null;

    private SingletonClass(){
        System.out.println("Creating a com.niloufar.training.learningspring.Singleton instance");
    }

    public static SingletonClass getSingletonInstance (){
        if(singletonInstance == null){
            return singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }
}
