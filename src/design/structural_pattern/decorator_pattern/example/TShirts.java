package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----Tshirt</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class TShirts extends Finery{
    public void show(){
        System.out.print("大T恤-----");
        super.show();
    }
}
