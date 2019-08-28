package design;

/**
 * @author Ethan
 * @date 2019/8/28 9:47
 */
public class Water implements Create {
    @Override
    public Factory create() {
        return new WaterFactory();
    }
}
