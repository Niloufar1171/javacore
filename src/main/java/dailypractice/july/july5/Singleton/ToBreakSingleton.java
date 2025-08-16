package dailypractice.july.july5.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {
        Singleton OriginalInstance = Singleton.getSingletonInstance();
        Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
        System.out.println("this is the hash code of the dublicates : " + DublicateInstance.hashCode());

//        //Reflextion have errors
//       System.out.println("**********************************************************");
//        Class<?> singletonClass = Class.forName("com.niloufar.training.learningspring.Singleton/com.niloufar.training.learningspring.Singleton");
//        Constructor<com.niloufar.training.learningspring.Singleton> constructor =(Constructor<com.niloufar.training.learningspring.Singleton>) singletonClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        com.niloufar.training.learningspring.Singleton brokenSingletonUsingReflection = constructor.newInstance();
//        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
//        System.out.println("this is the hash code of the brokenSingletonUsingReflection : " + brokenSingletonUsingReflection.hashCode());
//
//        //Serialization have errors
//        System.out.println("**********************************************************");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\serializeobject.ser"));
//        objectOutputStream.writeObject(objectOutputStream);
//        objectOutputStream.close();
//
//        //deserialization
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FilterInputStream("C:\\serializeobject.ser"));
//        com.niloufar.training.learningspring.Singleton brokenSingletonUsingSerialization = (com.niloufar.training.learningspring.Singleton) objectInputStream.readObject();

        //Clonning
       System.out.println("**********************************************************");
       Singleton brokenSingletonUsingCloning = (Singleton ) OriginalInstance.clone();
        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
        System.out.println("this is the hash code of the dublicates : " + brokenSingletonUsingCloning.hashCode());
    }
}
