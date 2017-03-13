package design.behavioral_design_pattern.mediator_pattern.example;

/**
 * <p>国家类</p>
 * Created by Administrator on 2017/3/11.
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
