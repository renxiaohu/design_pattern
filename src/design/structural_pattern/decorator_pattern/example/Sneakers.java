package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----Sneakers</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class Sneakers extends Finery{
    public void show(){
        System.out.print("破球鞋-----");
        super.show();
    }
}
