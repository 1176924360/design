package design;

/**
 * @author Ethan
 * @date 2019/8/28 9:27
 */
public class CreateFactory {
    //普通工程模式
    public Factory create(String type){
        if ("meat".equals(type))
            return new MeatFactory();
        else if ("water".equals(type))
            return new WaterFactory();
        else {
            System.out.println("参数不正确");
            return null;
        }
    }

    //多个工厂方法模式
    //将方法置为静态，即为静态方法模式
    public static Factory createMeat(){
        return new MeatFactory();
    }

    public static Factory createWater(){
        return new WaterFactory();
    }
}
