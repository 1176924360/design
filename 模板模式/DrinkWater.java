package design.template;

/**
 * @author Ethan
 * @date 2019/8/29 9:03
 */
public class DrinkWater extends DrinkTemplate {
    @Override
    protected void open() {
        System.out.println("打开保温杯");
    }

    @Override
    protected void water() {
        System.out.println("倒入红茶");
    }
}
