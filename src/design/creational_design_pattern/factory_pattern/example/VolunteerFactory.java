package design.creational_design_pattern.factory_pattern.example;

/**
 * Created by renxiaohu on 2016/12/2.
 */
public class VolunteerFactory implements LeiFengFactory{
    public LeiFeng CreateLeiFeng(){
        return new Volunteer();
    }
}