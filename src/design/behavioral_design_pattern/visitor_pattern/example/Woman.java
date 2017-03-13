package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Woman extends Person{
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
