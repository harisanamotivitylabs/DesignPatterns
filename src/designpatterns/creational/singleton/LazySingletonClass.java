package designpatterns.creational.singleton;

import java.io.Serializable;

public class LazySingletonClass implements Serializable {
    private static LazySingletonClass singletonClass=null;
    private LazySingletonClass(){}

    public static LazySingletonClass getSingletonPattern() {
        if (singletonClass == null)
        {
            singletonClass=new LazySingletonClass();
        }
        return singletonClass;
    }
}
 class EagerSingletonClass implements Serializable {
    //for multithreaded approach
    private static EagerSingletonClass singletonClass=new EagerSingletonClass();
    private EagerSingletonClass(){}

    public static EagerSingletonClass getSingletonPattern() {

        return singletonClass;
    }
}
class EagerSingletonClassForMultithreaded implements Serializable {
    //for multithreaded approach
    private static EagerSingletonClassForMultithreaded singletonClass=null;
    private EagerSingletonClassForMultithreaded(){}

    public static EagerSingletonClassForMultithreaded getSingletonPattern() {

        if(singletonClass==null)
        {
            synchronized (EagerSingletonClassForMultithreaded.class)
            {
                singletonClass=new EagerSingletonClassForMultithreaded();
            }
        }
        return singletonClass;
    }
}


