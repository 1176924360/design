package design;

/**
 * @author Ethan
 * @date 2019/8/28 9:26
 */
public class WaterFactory implements Factory {
    //普通工程模式
    @Override
    public void create() {
        System.out.println("自来水厂");
    }

}
