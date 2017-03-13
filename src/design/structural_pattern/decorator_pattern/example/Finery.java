package design.structural_pattern.decorator_pattern.example;

/**
 * <p>服饰类Decorator</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class Finery extends Person{
    protected Person component;

    //打扮
    public void Decorate(Person component){
        this.component=component;
    }
    @Override
    public void show(){
        component.show();
    }
}
