package design.creational_design_pattern.factory_pattern.example;

/**
 * Created by renxiaohu on 2016/12/2.
 */
public class MainLeiFeng {
    public static void main(String arges[]){
        LeiFengFactory factory = new VolunteerFactory();
        LeiFeng volunteer = factory.CreateLeiFeng();
        volunteer.BuyRice();
        volunteer.Sweep();
        volunteer.Wash();
    }
}
