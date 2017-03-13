package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----Tie</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class Tie extends Finery{
    public void show(){
        System.out.print("领带-----");
        super.show();
    }
}
