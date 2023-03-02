package designpatterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingletonClass lazySingletonClass=LazySingletonClass.getSingletonPattern();
        System.out.println(lazySingletonClass.hashCode());
        //breaking singleton using serializable
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("sobj.obj"));
        outputStream.writeObject(lazySingletonClass);
        outputStream.close();
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("sobj.obj"));
        LazySingletonClass readObject = (LazySingletonClass) inputStream.readObject();
        inputStream.close();
        System.out.println(readObject.hashCode());
       //breaking singleton with reflection api

        Constructor<?>[] constructors = LazySingletonClass.class.getDeclaredConstructors();
       Constructor constructor=constructors[0];
       constructor.setAccessible(true);
        LazySingletonClass lazySingleton = (LazySingletonClass) constructor.newInstance();
        System.out.println(lazySingleton.hashCode());
    }
}
