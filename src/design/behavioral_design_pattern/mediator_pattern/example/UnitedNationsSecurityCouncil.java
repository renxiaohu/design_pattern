package design.behavioral_design_pattern.mediator_pattern.example;

/**
 * Created by Administrator on 2017/3/11.
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

    private USA colleague1;
    private Iraq colleague2;

    //联合国安理会了解所有的国家，所以拥有美国和伊拉克的对象属性
    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country colleague) {
        //重写了“声明”方法，实现了两个对象间的通信
        if (colleague == colleague1){
            colleague2.getMessage(message);
        }else {
            colleague1.getMessage(message);
        }
    }
}
