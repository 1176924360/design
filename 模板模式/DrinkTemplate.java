package design.template;

/**
 * @author Ethan
 * @date 2019/8/29 8:58
 */
public abstract class DrinkTemplate {
    //打开水杯，自定义什么样子的水杯
    protected abstract void open();

    //倒入什么水
    protected abstract void water();


    public final void drink(){
        open();
        water();
        System.out.println("开始喝");
    }
}
