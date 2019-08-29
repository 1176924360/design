package design.template;
import org.junit.Test;
/**
 * @author Ethan
 * @date 2019/8/29 9:07
 */
public class TestDemo {

    @Test
    public void MyTest01(){
        DrinkWater drinkWater = new DrinkWater();
        drinkWater.drink();
    }

    @Test
    public void MyTest02(){
        DrinkTea drinkWater = new DrinkTea();
        drinkWater.drink();
    }

}
