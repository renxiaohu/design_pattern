package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----LeatherShoes</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class LeatherShoes extends Finery{
    public void show(){
        System.out.print("皮鞋-----");
        super.show();
    }
}
