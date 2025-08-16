package dailypractice.july.july5.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
      Singleton OriginalInstance = Singleton.getSingletonInstance();
      Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
        System.out.println("this is the hash code of the dublicates : " + DublicateInstance.hashCode());
    }
}
