package design.template;

/**
 * @author Ethan
 * @date 2019/8/29 9:09
 */
public class DrinkTea extends DrinkTemplate{
    @Override
    protected void open() {
        System.out.println("我是茶杯，没有盖子");
    }

    @Override
    protected void water() {
        System.out.println("倒入龙井");
    }
}
