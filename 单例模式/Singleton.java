package design;

/**
 * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * @author Ethan
 * @date 2019/8/28 8:59
 */
public class Singleton {
    //1、饿汉模式
    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return SINGLETON;
    }

    //2、懒汉模式
    private static volatile Singleton singleton = null;

    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (singleton){
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}
