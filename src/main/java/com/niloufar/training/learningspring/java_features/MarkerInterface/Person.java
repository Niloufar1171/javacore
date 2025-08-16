package com.niloufar.training.learningspring.java_features.MarkerInterface;

import java.io.*;

public class Person implements Externalizable {
    private int id;
    private String name ;
    private static final long serialVersionUID = 1L;

    public Person(){};

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBytes(name);
        out.writeInt(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//      id = in.readInt();
//      name = in.readLine();
        throw new NotSerializableException("You are not allowed to Deserialize this object");
    }
}
