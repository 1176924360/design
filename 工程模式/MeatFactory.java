package design;

/**
 * @author Ethan
 * @date 2019/8/28 9:25
 */
public class MeatFactory implements Factory {
    @Override
    public void create() {
        System.out.println("制肉工厂");
    }
}
