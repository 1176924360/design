package design;

/**
 * 定义一个用于创建对    象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * @author Ethan
 * @date 2019/8/28 9:05
 */
public interface Factory {
    public void create();
}
