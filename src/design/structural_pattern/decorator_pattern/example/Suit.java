package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----Suit</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class Suit extends Finery{
    public void show(){
        System.out.print("西装-----");
        super.show();
    }
}
