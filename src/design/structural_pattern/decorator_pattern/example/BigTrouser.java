package design.structural_pattern.decorator_pattern.example;

/**
 * <p>具体服饰类----BigTrouser</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class BigTrouser extends Finery{
    public void show(){
        System.out.print("垮裤-----");
        super.show();
    }
}
