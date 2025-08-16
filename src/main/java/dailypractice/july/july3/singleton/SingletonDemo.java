package dailypractice.july.july3.singleton;

import dailypractice.july.july3.singleton.SingletonClass;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonClass originalInstance = SingletonClass.getSingletonInstance();
        SingletonClass dublicateInstance = SingletonClass.getSingletonInstance();
        System.out.println("original instance : " + originalInstance.hashCode());
        System.out.println("dublicate instance: " + dublicateInstance.hashCode());
    }
}
