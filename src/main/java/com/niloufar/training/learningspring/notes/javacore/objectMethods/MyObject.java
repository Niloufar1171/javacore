package com.niloufar.training.learningspring.notes.javacore.objectMethods;

import java.util.Objects;

public class MyObject implements Cloneable {// we are saying this class is allowed to use field by field copy of the instances of this class !
    private String name;
    private int value;


    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public MyObject(String name) {
        this.name = name;
    }

    public MyObject(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Override clone() to make a copy field by filed
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //0- make sure you recieve an OBJECT type not an object of the class you defined as an arg in the equels method.
    //1- check if it has the same reference as our own object like it's one object but 2 differert refrence it is pointing at it.
    //2 - check if it is an instance of the class then
    //3- then if the object is an instance of my object class then check the values of the class field by field to see if ot is actually the same.
    // Override equals() to compare field values
    @Override
    public boolean equals(Object obj) {//<------type is Object
        if (this == obj) return true;
        if (!(obj instanceof MyObject)) return false;
        MyObject other = (MyObject) obj;
        return this.value == other.value && this.name.equals(other.name);
    }
    // Override hashCode() to return consistent hash
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Override toString() for meaningful representation
    @Override
    public String toString() {
        return "MyObject{name='" + name + "', value=" + value + "}";
    }

    // Override finalize() (Deprecated in newer Java)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for: " + this);
    }

    public synchronized void waitAndNotifyExample() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": Waiting...");
        wait(); // thread will wait until notify() or notifyAll()
        System.out.println(Thread.currentThread().getName() + ": Notified!");
    }

    public synchronized void triggerNotify() {
        notify(); // wake one thread
    }

    public synchronized void triggerNotifyAll() {
        notifyAll(); // wake all waiting threads
    }
}
